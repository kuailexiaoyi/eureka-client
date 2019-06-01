package com.springboot.eureka.client.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Auther: zrblog
 * @CreateTime: 2019-06-01 10:30
 * @Version:v1.0
 */
@Controller
@RequestMapping("/")
public class HelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    public String sayHello(String str) {
        return "Hello World,I'm from port:" + port+"," + str;
    }
}
