package com.lpp.spring.cloud.first.service.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message){
        return String.format("Hi, your message is：%s port:%s",message,port);
    }
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String sayH1i(){
        return String.format("Hi, your message is：%s port:%s","aaa",port);
    }
}
