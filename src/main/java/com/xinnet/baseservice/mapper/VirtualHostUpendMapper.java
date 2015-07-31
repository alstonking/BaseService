package com.xinnet.baseservice.mapper;

import com.xinnet.baseservice.entity.VirtualHostUpend;

public interface VirtualHostUpendMapper {
    int deleteByPrimaryKey(Long id);

    int insert(VirtualHostUpend record);

    int insertSelective(VirtualHostUpend record);

    VirtualHostUpend selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VirtualHostUpend record);

    int updateByPrimaryKey(VirtualHostUpend record);
}