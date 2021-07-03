package com.winnie.biz.store.service.impl;

import com.winnie.biz.store.dao.IStoreDao;
import com.winnie.biz.store.service.IStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @desc 仓库服务
 * @auther winnie
 * @date 2021/7/2
 */
@Service
public class StoreServiceImpl implements IStoreService {
    @Autowired
    IStoreDao storeDao;

    /**
     * 剩余商品数量
     * @param goodsId
     * @return
     */
    @Override
    public Integer countLeftGoods(String goodsId) {
        Integer leftGoods = storeDao.countLeftGoods(goodsId);
        return leftGoods;
    }

    /**
     * 减库存
     * @param goodsId
     */
    @Override
    public void reduceGoods(String goodsId) {
        storeDao.reduceGoods(goodsId);
    }
}
