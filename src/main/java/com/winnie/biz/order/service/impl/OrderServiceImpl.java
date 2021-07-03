package com.winnie.biz.order.service.impl;

import com.winnie.biz.order.dao.OrderDao;
import com.winnie.biz.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @desc 订单服务
 * @auther winnie
 * @date 2021/7/2
 */
@Service
public class OrderServiceImpl implements IOrderService {

    @Autowired
    OrderDao orderDao;

    /**
     * 新增订单
     * @param goodsId
     */
    @Override
    public void insertOrder(String goodsId) {
        orderDao.insertOrder(goodsId);
    }
}
