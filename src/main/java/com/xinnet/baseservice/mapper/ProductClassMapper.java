package com.xinnet.baseservice.mapper;

import com.xinnet.baseservice.entity.ProductClass;

public interface ProductClassMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProductClass record);

    int insertSelective(ProductClass record);

    ProductClass selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductClass record);

    int updateByPrimaryKey(ProductClass record);
}