package com.geotmt.serviceadmin.controller;

import com.geotmt.serviceadmin.entity.TbSysUser;
import com.geotmt.serviceadmin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("sysuser")
public class TbSysUserController {

    @Autowired
    AdminService adminService;

    @RequestMapping("/register")
    public String register(@RequestBody TbSysUser tbSysUser){

        try{
            adminService.register(tbSysUser);
        }catch (Exception e){
            e.printStackTrace();
        }

        return "sucess";
    }

    @RequestMapping("")
    public String aaa(){


        return "sucess";
    }
}
