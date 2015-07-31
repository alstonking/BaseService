package com.xinnet.baseservice.mapper;

import com.xinnet.baseservice.entity.EasyCloudDel;

public interface EasyCloudDelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EasyCloudDel record);

    int insertSelective(EasyCloudDel record);

    EasyCloudDel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EasyCloudDel record);

    int updateByPrimaryKey(EasyCloudDel record);
}