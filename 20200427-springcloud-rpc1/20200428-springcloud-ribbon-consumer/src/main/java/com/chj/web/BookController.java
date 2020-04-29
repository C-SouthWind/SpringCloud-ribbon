package com.chj.web;

import com.chj.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2020/4/27 20:16
 * @params :
 */
@RestController
public class BookController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    /**
     * ribbon脱离eureka实现负载均衡
     */
    @GetMapping("/NoEureka")
    public List<Book> selectAllNoEureka(){
        ServiceInstance serviceInstance = loadBalancerClient.choose("book-provider");
        String host = serviceInstance.getHost();
        System.out.println(host);
        int port = serviceInstance.getPort();
        System.out.println(port);
        return restTemplate.getForObject("http://"+host+":"+port+"/ProBook",List.class);
    }
}
































