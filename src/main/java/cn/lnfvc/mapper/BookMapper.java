package cn.lnfvc.mapper;


import cn.lnfvc.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BookMapper {
    List<Book> findAllBooks();
}
