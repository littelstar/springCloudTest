package com.lpp.spring.cloud.web.admin.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//指定服务提供者的application.name
@FeignClient(value = "hello-spring-cloud-service-admin")
public interface AdminService {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "message") String message);
}
