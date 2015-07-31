package com.xinnet.baseservice.mapper;

import com.xinnet.baseservice.entity.VirtualHost;

public interface VirtualHostMapper {
    int deleteByPrimaryKey(Long id);

    int insert(VirtualHost record);

    int insertSelective(VirtualHost record);

    VirtualHost selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VirtualHost record);

    int updateByPrimaryKey(VirtualHost record);
}