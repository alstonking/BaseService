package com.xinnet.baseservice.virtualhost.bo;

import com.xinnet.baseservice.entity.VirtualHostPre;
import org.springframework.stereotype.Component;

/**
 * Created by lenovo on 2015/7/30.
 */
@Component
public interface VirtualHostPreBO {

    public int addVirtualHostPreInfo(VirtualHostPre virtualHostPre);

    public VirtualHostPre getVirtualHostPreInfo(VirtualHostPre virtualHostPre);
}
