package com.chj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ：chj
 * @date ：Created in 2020/4/28 20:31
 * @params :
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudDanJi7081 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDanJi7081.class,args);
    }
}
