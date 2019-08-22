package com.geotmt.serviceadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "com.geotmt.serviceadmin.mapper")
public class ServiceAdminApplication  {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAdminApplication .class, args);
    }

}
