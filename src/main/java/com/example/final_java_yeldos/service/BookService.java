package com.example.final_java_yeldos.service;

import com.example.final_java_yeldos.model.Book;
import com.example.final_java_yeldos.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book saveBook(Book book){
        return bookRepository.save(book);
    }

    @Cacheable("books")
    public Iterable<Book> findAllBook() {
        return bookRepository.findAll();
    }

    public Optional<Book> findBookById(Long id) {
        return bookRepository.findById(id);
    }

    public Book updateById(Book book){
        return bookRepository.save(book);
    }

    public void deleteById(Long id){
        bookRepository.deleteById(id);
    }
}
