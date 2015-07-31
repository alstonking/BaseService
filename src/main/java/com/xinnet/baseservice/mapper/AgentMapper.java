package com.xinnet.baseservice.mapper;

import com.xinnet.baseservice.entity.Agent;

public interface AgentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Agent record);

    int insertSelective(Agent record);

    Agent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Agent record);

    int updateByPrimaryKey(Agent record);
}