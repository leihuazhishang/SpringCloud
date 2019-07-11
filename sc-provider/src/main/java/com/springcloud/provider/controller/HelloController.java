package com.springcloud.provider.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hanlu
 * @date 2019/7/10 10:39
 */
@RestController
public class HelloController {

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "{\"xh\":9051,\"name\":\"张三\",\"age\":12}";
    }
}
