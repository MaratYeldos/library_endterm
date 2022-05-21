package com.example.final_java_yeldos.service;

import com.example.final_java_yeldos.model.Author;
import com.example.final_java_yeldos.repository.AuthorRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.mockito.Mockito.*;

class AuthorServiceTest {
    @Mock
    AuthorRepository authorRepository;
    @InjectMocks
    AuthorService authorService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testSaveAuthor() {
        Author result = authorService.saveAuthor(new Author(Long.valueOf(1), "name"));
        Assertions.assertNotEquals(new Author(Long.valueOf(1), "name"), result);
    }

    @Test
    void testFindAllAuthor() {
        Iterable<Author> result = authorService.findAllAuthor();
        Assertions.assertNotEquals(null, result);
    }

    @Test
    void testFindAuthorById() {
        Optional<Author> result = authorService.findAuthorById(Long.valueOf(1));
        Assertions.assertNotEquals(null, result);
    }

    @Test
    void testUpdateById() {
        Author result = authorService.updateById(new Author(Long.valueOf(1), "name"));
        Assertions.assertNotEquals(new Author(Long.valueOf(1), "name"), result);
    }

    @Test
    void testDeleteById() {
        authorService.deleteById(Long.valueOf(1));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme