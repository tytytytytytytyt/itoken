package com.geotmt.itokenconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.geotmt.itokenconfig.mapper")
@SpringBootApplication
public class TokenConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(TokenConfigApplication.class, args);
    }

}
