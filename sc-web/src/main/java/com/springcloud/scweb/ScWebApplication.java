package com.springcloud.scweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class ScWebApplication {

    public static void main(String[] args) {

        SpringApplication.run(ScWebApplication.class, args);
    }

    //创建RestTemplate对象
    @Bean
    @LoadBalanced//支持使用服务名称发现服务进行调用，并支持负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
