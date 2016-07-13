package org.goshop.store.service;

import org.goshop.common.dubbo.spring.annotation.DubboService;
import org.goshop.store.i.StoreGoodsClassService;
import org.goshop.store.mapper.master.StoreGoodsClassMapper;
import org.goshop.store.pojo.StoreGoodsClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@DubboService(interfaceClass = StoreGoodsClassService.class)
public class StoreGoodsClassServiceImpl implements StoreGoodsClassService {
    @Autowired
    StoreGoodsClassMapper storeGoodsClassMapper;

    @Override
    public List<StoreGoodsClass> findByStcParentId(Integer parentId) {
        return storeGoodsClassMapper.findByStcParentId(parentId);
    }
}
