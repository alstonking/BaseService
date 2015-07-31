package com.xinnet.baseservice.virtualhost.service;

import com.xinnet.baseservice.entity.VirtualHostPre;
import com.xinnet.core.dto.ResultDTO;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2015/7/29.
 */
@Service
public interface VirtualHostPreService {
    /**
     * 虚拟主机预开通表添加数据
     * 适用于业务平台虚拟主机购买后的结算业务
     * @param virtualHostPre
     */
    public ResultDTO<Integer> addVirtualHostPreInfo(VirtualHostPre virtualHostPre);

}
