package com.xinnet.baseservice.mapper;

import com.xinnet.baseservice.entity.ProductServiceType;

public interface ProductServiceTypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ProductServiceType record);

    int insertSelective(ProductServiceType record);

    ProductServiceType selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductServiceType record);

    int updateByPrimaryKey(ProductServiceType record);
}