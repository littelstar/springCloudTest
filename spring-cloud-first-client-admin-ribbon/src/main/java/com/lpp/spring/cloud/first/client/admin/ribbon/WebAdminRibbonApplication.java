package com.lpp.spring.cloud.first.client.admin.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @EnableDiscoveryClient 注解注册到服务中心
 * @EnableHystrix 开启熔断器
 * @EnableHystrixDashboard 熔断器仪表盘监控
 */

@EnableHystrixDashboard
@EnableHystrix
@EnableDiscoveryClient
@SpringBootApplication
public class WebAdminRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebAdminRibbonApplication.class,args);
    }
}
