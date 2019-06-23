package com.example.consul.helloController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:zhanCai
 * @Description:
 * @Date:Created in  17:33 2019/6/23
 * @Modified by
 */
@RestController
public class HelloController {

    @GetMapping(value="/hello")
    public String helloSpringBoot(){
        String hello = "hello,Spring boot";
        return hello;
    }
}
