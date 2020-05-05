package com.chj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：chj
 * @date ：Created in 2020/5/5 14:45
 * @params :
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonApplication8081 {
    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication8081.class,args);
    }
}
