package com.springcloud.scweb.controller;

import com.springcloud.scweb.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import sun.net.www.http.HttpClient;

/**
 * @author hanlu
 * @date 2019/7/11 19:32
 */
@Controller
public class IndexController {

      @Autowired
   private RestTemplate restTemplate;

    @RequestMapping("/sayHello")
    public String sayHello(){
         //调用服务获取信息
         //使用RestTemplate对象调用eureka的http服务
        Student student = restTemplate.getForObject("http://localhost:9002/sayHello", Student.class);
        System.out.println("学生信息"+student);
        return null;
    }
}
