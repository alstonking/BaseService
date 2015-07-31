package com.xinnet.baseservice.mapper;

import com.xinnet.baseservice.entity.EasyCloudPre;

public interface EasyCloudPreMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EasyCloudPre record);

    int insertSelective(EasyCloudPre record);

    EasyCloudPre selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EasyCloudPre record);

    int updateByPrimaryKey(EasyCloudPre record);
}