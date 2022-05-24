package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaServer
@SpringBootApplication
@RestController
public class ServiceMeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceMeApplication.class, args);
    }
    @Value("${name}")
    String name ;
    @RequestMapping("/show")
    public String show(){
        return name;
    }
}
