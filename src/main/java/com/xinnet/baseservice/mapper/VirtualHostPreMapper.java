package com.xinnet.baseservice.mapper;

import com.xinnet.baseservice.entity.VirtualHostPre;

public interface VirtualHostPreMapper {
    int deleteByPrimaryKey(Long id);

    int addVirtualHostPreInfo(VirtualHostPre record);

    int insertSelective(VirtualHostPre record);

    VirtualHostPre selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VirtualHostPre record);

    int updateByPrimaryKey(VirtualHostPre record);
}