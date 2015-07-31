package com.xinnet.baseservice.virtualhost.service.impl;

import com.xinnet.baseservice.entity.VirtualHostPre;
import com.xinnet.baseservice.virtualhost.service.VirtualHostPreService;
import com.xinnet.core.dto.ResultDTO;
import org.apache.poi.util.SystemOutLogger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.*;
import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Created by lenovo on 2015/7/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml" })
public class TestVirtualHostService {
    @Autowired
    private VirtualHostPreService virtualHostPreService;


    @Test
    @Rollback(false)
    public void testAddVirtualHostPreInfo() {
        VirtualHostPre virtualHostPre = new VirtualHostPre();

        virtualHostPre.setAgentCode("agent35132");
        virtualHostPre.setDatabaseGroup(" ");
        virtualHostPre.setDatacenterCount(0L);
        virtualHostPre.setDbSpaceSize(20);
        virtualHostPre.setDbType("2008mysql");
        virtualHostPre.setDomainName(" ");
        virtualHostPre.setFirstServiceCode(" ");
        virtualHostPre.setGoodsCode("GA000000000005");
        virtualHostPre.setGoodsType("01");
        virtualHostPre.setHomeDir(" ");
        virtualHostPre.setHostServerGroup(" ");
        virtualHostPre.setIcpLoopState(" ");
        virtualHostPre.setIsSelectIndependentIp("0");
        virtualHostPre.setPassword("V7R8h2V9");
        virtualHostPre.setProductCode("AG0000000000000005");
        virtualHostPre.setUserName("net6328948");
        virtualHostPre.setServiceCode("V54363995990975");
        virtualHostPre.setVirtualhostId(" ");
        virtualHostPre.setQuotaSize(500L);
        virtualHostPre.setUpgradeType(" ");
        virtualHostPre.setTimeUnit("Y");
        virtualHostPre.setTimeAmount(1);
        virtualHostPre.setTasteType("01");
        virtualHostPre.setSiteType(" ");
        virtualHostPre.setSetWeb("yse");
        virtualHostPre.setSetDns("yse");
        virtualHostPre.setServiceType("newBJZWWIN500DB2008MYSQL5");
        virtualHostPre.setServiceState("00");
        virtualHostPre.setServiceStartDate(new Date());
        virtualHostPre.setServiceFrom(" ");
        virtualHostPre.setServiceEndDate(new Date());
        virtualHostPre.setSericeBuyTime(new Date());
        virtualHostPre.setSericeActiveLimit(new Date());
        virtualHostPre.setSericeActiveLimit(new Date());
        virtualHostPre.setIsSelectIndependentIp("0");
        virtualHostPre.setRenewType(" ");
        virtualHostPre.setModifyTime(new Date());
        virtualHostPre.setLoginIp(" ");
        virtualHostPre.setLoginCount(51);
        virtualHostPre.setOpenMark("error");
        virtualHostPre.setReturnsType(" ");
        ResultDTO<Integer> resultDTO = virtualHostPreService.addVirtualHostPreInfo(virtualHostPre);
        assertEquals(resultDTO.getObject().intValue(), 1);
    }
}
