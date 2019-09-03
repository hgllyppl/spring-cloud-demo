package com.spring.cloud.client.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
// 注意, 此行为包的扫描路径, 不是域名路径
@EnableFeignClients("com.spring.cloud.api.demo")
public class ClientMain {

    public static void main(String[] args) {
        SpringApplication.run(ClientMain.class, args);
    }
}
