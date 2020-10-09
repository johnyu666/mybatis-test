package cn.lnfvc.controller;

import cn.lnfvc.mapper.BookMapper;
import cn.lnfvc.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class BookController {
    @Resource
    private BookMapper bookMapper;
    @GetMapping("/books")
    public List<Book> findAllBooks(){
        return bookMapper.findAllBooks();
    }
}
