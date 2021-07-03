package com.winnie.biz.order.dao;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

/**
 * @desc 订单持久层
 * @auther winnie
 * @date 2021/7/2
 */
@Repository
public interface OrderDao {
    /**
     * 新增订单
     * @param goodsId
     */
    @Insert("INSERT INTO T_ORDER(GOODS_ID) VALUES(#{goodsId})")
    void insertOrder(String goodsId);
}
