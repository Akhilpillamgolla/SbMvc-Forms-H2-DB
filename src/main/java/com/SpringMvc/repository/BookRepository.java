package com.SpringMvc.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringMvc.enity.BookEntity;

@Repository                 //optional even if we don't write no problem
public interface BookRepository extends JpaRepository<BookEntity, Serializable>{
 // SERIALIZABLE supports all types of data like Integer ,String
}
