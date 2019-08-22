package com.geotmt.itokenconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class TokenConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(TokenConfigApplication.class, args);
    }

}
