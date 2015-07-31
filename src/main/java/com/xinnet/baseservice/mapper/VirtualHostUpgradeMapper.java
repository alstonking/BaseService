package com.xinnet.baseservice.mapper;

import com.xinnet.baseservice.entity.VirtualHostUpgrade;

public interface VirtualHostUpgradeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(VirtualHostUpgrade record);

    int insertSelective(VirtualHostUpgrade record);

    VirtualHostUpgrade selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(VirtualHostUpgrade record);

    int updateByPrimaryKey(VirtualHostUpgrade record);
}