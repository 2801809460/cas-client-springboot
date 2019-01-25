package com.it.casclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lee
 * @date 2019/1/24
 */
@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }
}
