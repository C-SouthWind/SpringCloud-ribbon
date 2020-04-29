package com.chj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ：chj
 * @date ：Created in 2020/4/27 20:15
 * @params :
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.chj.mapper")
public class ProviderWebApplication8082 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderWebApplication8082.class,args);
    }
}
