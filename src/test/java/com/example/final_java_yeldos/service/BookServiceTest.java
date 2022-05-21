package com.example.final_java_yeldos.service;

import com.example.final_java_yeldos.model.Author;
import com.example.final_java_yeldos.model.Book;
import com.example.final_java_yeldos.repository.BookRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;

import static org.mockito.Mockito.*;

class BookServiceTest {
    @Mock
    BookRepository bookRepository;
    @InjectMocks
    BookService bookService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testSaveBook() {
        Book result = bookService.saveBook(new Book(Long.valueOf(1), "bookName", new HashSet<Author>(Arrays.asList(new Author(Long.valueOf(1), "name")))));
        Assertions.assertNotEquals(new Book(Long.valueOf(1), "bookName", new HashSet<Author>(Arrays.asList(new Author(Long.valueOf(1), "name")))), result);
    }

    @Test
    void testFindAllBook() {
        Iterable<Book> result = bookService.findAllBook();
        Assertions.assertNotEquals(null, result);
    }

    @Test
    void testFindBookById() {
        Optional<Book> result = bookService.findBookById(Long.valueOf(1));
        Assertions.assertNotEquals(null, result);
    }

    @Test
    void testUpdateById() {
        Book result = bookService.updateById(new Book(Long.valueOf(1), "bookName", new HashSet<Author>(Arrays.asList(new Author(Long.valueOf(1), "name")))));
        Assertions.assertNotEquals(new Book(Long.valueOf(1), "bookName", new HashSet<Author>(Arrays.asList(new Author(Long.valueOf(1), "name")))), result);
    }

    @Test
    void testDeleteById() {
        bookService.deleteById(Long.valueOf(1));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme