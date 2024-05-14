package com.example.apiiii.service;


import com.example.apiiii.Entity.Book;
import com.example.apiiii.pojo.BookPojo;
import com.example.apiiii.projection.Bookprojection;

import java.util.List;

public interface BookService {
    Book saveData(BookPojo bookpojo);
    List<Bookprojection> findAll() ;
    List<Bookprojection> findAll2() ;

    void deleteAll(BookPojo bookPojo) ;

}