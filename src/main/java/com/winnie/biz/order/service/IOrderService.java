package com.winnie.biz.order.service;

import org.springframework.stereotype.Service;

/**
 * @desc 描述
 * @auther winnie
 * @date 2021/7/2
 */
public interface IOrderService {
    /**
     * 新增订单
     * @param goodsId
     */
    void insertOrder(String goodsId);
}
