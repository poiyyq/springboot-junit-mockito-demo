package com.winnie.biz.order.controller;

import com.winnie.biz.order.dto.OrderDTO;
import com.winnie.biz.order.service.IOrderService;
import com.winnie.biz.store.service.IStoreService;
import com.winnie.common.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 订单
 */
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    IStoreService storeService;
    @Autowired
    IOrderService orderService;

    @PostMapping
    public ResponseVO addOrder(@RequestBody OrderDTO orderDTO){
        ResponseVO responseVO;
        Integer leftGoodsSize = storeService.countLeftGoods(orderDTO.getGoodsId());
        if(leftGoodsSize!=null && leftGoodsSize>0){
            // 下单
            orderService.insertOrder(orderDTO.getGoodsId());
            // 减库存
            int t = 1/0;
            storeService.reduceGoods(orderDTO.getGoodsId());
            responseVO = ResponseVO.ok("创建订单成功");
        } else {
            responseVO = ResponseVO.fail("创建订单失败");
        }
        return responseVO;
    }

}
