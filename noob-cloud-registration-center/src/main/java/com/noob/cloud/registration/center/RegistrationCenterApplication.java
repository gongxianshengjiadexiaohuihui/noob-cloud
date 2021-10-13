package com.noob.cloud.registration.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author:ggp
 * @Date:2021/10/12 21:33
 * @Description:
 */
@EnableEurekaServer
@SpringBootApplication
public class RegistrationCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegistrationCenterApplication.class,args);
    }
}
