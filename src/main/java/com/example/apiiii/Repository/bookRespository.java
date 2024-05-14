package com.example.apiiii.Repository;

import com.example.apiiii.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bookRespository extends JpaRepository<Book, Integer> {

}