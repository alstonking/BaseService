package com.xinnet.baseservice.mapper;

import com.xinnet.baseservice.entity.VirtualHostSubProduct;

public interface VirtualHostSubProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(VirtualHostSubProduct record);

    int insertSelective(VirtualHostSubProduct record);

    VirtualHostSubProduct selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VirtualHostSubProduct record);

    int updateByPrimaryKey(VirtualHostSubProduct record);
}