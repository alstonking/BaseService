package com.xinnet.baseservice.virtualhost.service.impl;

import com.xinnet.baseservice.entity.VirtualHostPre;
import com.xinnet.baseservice.virtualhost.bo.VirtualHostPreBO;
import com.xinnet.baseservice.virtualhost.service.VirtualHostPreService;
import com.xinnet.core.dto.ResultDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2015/7/29.
 */
@Service("VirtualHostService")
public class VirtualHostPreServiceImpl implements VirtualHostPreService {
    @Autowired
    private VirtualHostPreBO virtualHostBO;

    @Override
    public ResultDTO<Integer> addVirtualHostPreInfo(VirtualHostPre virtualHostPre) {
        int addCount = virtualHostBO.addVirtualHostPreInfo(virtualHostPre);
        if (addCount != 1) {
           return ResultDTO.getFailureResult("virtualhostpre.add.fail.100");
        }
        return ResultDTO.getSuccess("virtualhostpre.add.success.101", 1);
    }


}
