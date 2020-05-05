package com.chj.web;

import com.chj.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2020/5/5 15:22
 * @params :
 */
@RestController
public class BookConfig {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/NoRureka")
    public List<Book> selectAll(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("book-provider");
        String host = serviceInstance.getHost();
        System.out.println(host);
        int port = serviceInstance.getPort();
        System.out.println(port);
        return restTemplate.getForObject("http://"+host+":"+port+"/ProBook",List.class);
    }
}
