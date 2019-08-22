package com.geotmt.serviceadmin;


import com.alibaba.fastjson.JSON;
import com.geotmt.serviceadmin.ServiceAdminApplication;
import com.geotmt.serviceadmin.entity.TbSysUser;
import com.geotmt.serviceadmin.service.AdminService;
import com.netflix.discovery.converters.wrappers.CodecWrappers;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import java.util.Date;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceAdminApplication.class)
@ActiveProfiles(value = "dev")
public class ServiceAdminTests {

    @Autowired
    private AdminService adminService;

    /**
     * 注册
     */
    @Test
    public void testRegister() {
        TbSysUser tbSysUser = new TbSysUser();
        tbSysUser.setUserCode(UUID.randomUUID().toString());
        tbSysUser.setLoginCode("778450868@qq.com");
        tbSysUser.setUserName("zjd");
        tbSysUser.setUserType("1");
        tbSysUser.setMgrType("1");
        tbSysUser.setStatus("0");
        tbSysUser.setCreateBy(tbSysUser.getUserCode());
        tbSysUser.setCreateDate(new Date());
        tbSysUser.setUpdateBy(tbSysUser.getUserCode());
        tbSysUser.setUpdateDate(new Date());
        tbSysUser.setCorpCode("0");
        tbSysUser.setCorpName("iToken");
        tbSysUser.setPassword(DigestUtils.md5DigestAsHex("123456".getBytes()));

        System.out.println(JSON.toJSON(tbSysUser));
        adminService.register(tbSysUser);
    }

    /**
     * 登录
     */
    @Test
    public void testLogin() {
        TbSysUser tbSysUser = adminService.login("778450868@qq.com", "123456");
        //Assert.assertNotNull(tbSysUser);
        System.out.println(JSON.toJSON(tbSysUser));
    }

}
