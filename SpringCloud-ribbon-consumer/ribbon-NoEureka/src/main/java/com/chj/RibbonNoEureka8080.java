package com.chj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：chj
 * @date ：Created in 2020/5/5 15:20
 * @params :
 */
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonNoEureka8080 {
    public static void main(String[] args) {
        SpringApplication.run(RibbonNoEureka8080.class,args);
    }
}
