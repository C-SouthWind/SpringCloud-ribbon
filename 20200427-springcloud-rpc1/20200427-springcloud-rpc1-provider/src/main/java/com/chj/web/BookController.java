package com.chj.web;

import com.chj.model.Book;
import com.chj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ：chj
 * @date ：Created in 2020/4/27 20:16
 * @params :
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    /**
     * 生产者查询
     * @return
     */
    @GetMapping("/ProBook")
    public List<Book> selectAll(){
        return bookService.selectAll();
    }
}
