package com.sukmanov.referencemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SukmanovReferenceManagerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SukmanovReferenceManagerServiceApplication.class, args);
    }

}
