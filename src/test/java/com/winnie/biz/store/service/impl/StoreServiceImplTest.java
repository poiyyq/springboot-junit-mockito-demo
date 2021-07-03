package com.winnie.biz.store.service.impl;

import com.winnie.biz.store.service.IStoreService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 启动springboot环境进行单元测试
 * 此方式会调用真实依赖对象
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class StoreServiceImplTest {
    @Autowired
    IStoreService storeService;

    @Test
    public void testCountLeftGoods() {
        String goodsId = "1";
        Assert.assertEquals(Integer.valueOf(1), storeService.countLeftGoods(goodsId));
    }
}