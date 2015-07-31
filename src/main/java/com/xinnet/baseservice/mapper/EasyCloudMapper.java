package com.xinnet.baseservice.mapper;

import com.xinnet.baseservice.entity.EasyCloud;

public interface EasyCloudMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EasyCloud record);

    int insertSelective(EasyCloud record);

    EasyCloud selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EasyCloud record);

    int updateByPrimaryKey(EasyCloud record);
}