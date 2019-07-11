package com.springcloud.scservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer//启动EurekaServer
public class ScServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(ScServiceApplication.class, args);
    }

}
