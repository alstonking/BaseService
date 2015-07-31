package com.xinnet.baseservice.virtualhost.bo.impl;

import com.xinnet.baseservice.entity.VirtualHostPre;
import com.xinnet.baseservice.mapper.VirtualHostPreMapper;
import com.xinnet.baseservice.virtualhost.bo.VirtualHostPreBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by lenovo on 2015/7/30.
 */
@Component("VirtualhostBO")
public class VirtualHostPreBOImpl implements VirtualHostPreBO {
    @Autowired
    private VirtualHostPreMapper virtualHostPreMapper;

    @Override
    public int addVirtualHostPreInfo(VirtualHostPre virtualHostPre) {
        return virtualHostPreMapper.addVirtualHostPreInfo(virtualHostPre);
    }

    @Override
    public VirtualHostPre getVirtualHostPreInfo(VirtualHostPre virtualHostPre) {
        return virtualHostPreMapper.selectByPrimaryKey(virtualHostPre.getId());
    }
}
