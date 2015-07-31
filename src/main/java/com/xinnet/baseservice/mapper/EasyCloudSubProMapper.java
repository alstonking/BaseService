package com.xinnet.baseservice.mapper;

import com.xinnet.baseservice.entity.EasyCloudSubPro;

public interface EasyCloudSubProMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EasyCloudSubPro record);

    int insertSelective(EasyCloudSubPro record);

    EasyCloudSubPro selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EasyCloudSubPro record);

    int updateByPrimaryKey(EasyCloudSubPro record);
}