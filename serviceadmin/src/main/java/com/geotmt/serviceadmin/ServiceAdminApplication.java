package com.geotmt.serviceadmin;

import com.geotmt.serviceadmin.entity.TbSysUser;
import com.geotmt.serviceadmin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.spring.annotation.MapperScan;



@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.geotmt.serviceadmin.mapper")
public class ServiceAdminApplication  {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAdminApplication .class, args);
    }
}
