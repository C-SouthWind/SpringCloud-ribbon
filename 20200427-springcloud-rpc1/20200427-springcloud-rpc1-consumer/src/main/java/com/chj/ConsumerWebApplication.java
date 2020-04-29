package com.chj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：chj
 * @date ：Created in 2020/4/27 20:32
 * @params :
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerWebApplication.class,args);
    }
}
