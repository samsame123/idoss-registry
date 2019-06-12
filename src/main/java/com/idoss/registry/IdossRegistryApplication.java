package com.idoss.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by xiaoxuwang on 2019/6/12.
 */

@SpringBootApplication
@EnableEurekaServer
public class IdossRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdossRegistryApplication.class, args);
    }

}
