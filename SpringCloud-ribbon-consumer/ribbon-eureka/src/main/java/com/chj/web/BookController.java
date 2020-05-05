package com.chj.web;

import com.chj.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2020/5/5 14:42
 * @params :
 */
@RestController
public class BookController {
    @Autowired
    private RestTemplate restTemplate;
    /** 方法描述 
    * @Description: 消费查询数据
    * @Param: []
    * @return: java.util.List<com.chj.model.Book>
    * @Author: chj
    * @Date: 2020/5/5
    */
    @GetMapping("/ConBookAll")
    public List<Book> selectAll(){
        return restTemplate.getForObject("http://BOOK-PROVIDER/ProBookAll",List.class);
    }
}
