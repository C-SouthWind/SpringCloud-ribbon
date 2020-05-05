package com.chj.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ：chj
 * @date ：Created in 2020/5/5 14:38
 * @params :
 */
@Configuration
public class ReatConfig {
    /** 方法描述 
    * @Description: SpringCloud所提供的rpc方法
    * @Param: []
    * @return: org.springframework.web.client.RestTemplate
    * @Author: chj
    * @Date: 2020/5/5
    */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    /** 方法描述
    * @Description: 随机分发
    * @Param: []
    * @return: com.netflix.loadbalancer.IRule
    * @Author: chj
    * @Date: 2020/5/5
    */
    @Bean
    public IRule mineRule(){
        return new RandomRule();
    }
}
