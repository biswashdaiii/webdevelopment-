package com.example.apiiii.service.impl;

import com.example.apiiii.pojo.BookPojo;
import com.example.apiiii.Repository.bookRespository;
import com.example.apiiii.Repository.groundRepository;
import com.example.apiiii.Repository.userRepository;
import com.example.apiiii.Entity.Book;
import com.example.apiiii.Entity.Ground;
import com.example.apiiii.Entity.User;
import com.example.apiiii.projection.Bookprojection;
import com.example.apiiii.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
class BookServiceImpl implements BookService {

    private final bookRespository bookRespository;
    private final userRepository userRepository;
    private final groundRepository groundRepository;


    @Override
    public Book saveData(BookPojo bookPojo) {
        Book book = new Book();
//        book.setId(bookPojo.getId()) ;
//        book.setGroundId(bookPojo.getId()) ;
        book.setBookName(bookPojo.getBookName());
        Ground ground = groundRepository.findById(bookPojo.getGroundId()).get();
        book.setGround(ground);

        User user = userRepository.findById(bookPojo.getUserId()).get();
        book.setUser(user);
        bookRespository.save(book);


        return book;
    }

    @Override
    public List<Bookprojection> findAll() {
        return List.of();
    }

    @Override
    public List<Bookprojection> findAll2() {
        return List.of();
    }

    @Override
    public void deleteAll(BookPojo bookPojo) {

    }
}