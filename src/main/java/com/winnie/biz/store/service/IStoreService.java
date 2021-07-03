package com.winnie.biz.store.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @desc 仓库服务
 * @auther winnie
 * @date 2021/7/2
 */
@Transactional
public interface IStoreService {
    /**
     * 统计剩余商品数量
     * @param goodsId
     * @return
     */
    Integer countLeftGoods(String goodsId);

    /**
     * 减库存
     * @param goodsId
     */
    void reduceGoods(String goodsId);
}
