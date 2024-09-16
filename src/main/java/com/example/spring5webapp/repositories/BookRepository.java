package com.example.spring5webapp.repositories;

import com.example.spring5webapp.dom.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
