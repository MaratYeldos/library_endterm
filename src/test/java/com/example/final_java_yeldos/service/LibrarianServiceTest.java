package com.example.final_java_yeldos.service;

import com.example.final_java_yeldos.model.Librarian;
import com.example.final_java_yeldos.model.RoleType;
import com.example.final_java_yeldos.repository.LibrarianRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.mockito.Mockito.*;

class LibrarianServiceTest {
    @Mock
    LibrarianRepository librarianRepository;
    @InjectMocks
    LibrarianService librarianService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testSaveLibrarian() {
        Librarian result = librarianService.saveLibrarian(new Librarian("name", "address", "email", Long.valueOf(1), RoleType.ROLE_ADMIN, "librarianPassword"));
        Assertions.assertNotEquals(new Librarian("name", "address", "email", Long.valueOf(1), RoleType.ROLE_ADMIN, "librarianPassword"), result);
    }

    @Test
    void testFindAllLibrarian() {
        Iterable<Librarian> result = librarianService.findAllLibrarian();
        Assertions.assertNotEquals(null, result);
    }

    @Test
    void testFindLibrarianById() {
        Optional<Librarian> result = librarianService.findLibrarianById(Long.valueOf(1));
        Assertions.assertNotEquals(null, result);
    }

    @Test
    void testUpdateById() {
        Librarian result = librarianService.updateById(new Librarian("name", "address", "email", Long.valueOf(1), RoleType.ROLE_ADMIN, "librarianPassword"));
        Assertions.assertNotEquals(new Librarian("name", "address", "email", Long.valueOf(1), RoleType.ROLE_ADMIN, "librarianPassword"), result);
    }

    @Test
    void testDeleteById() {
        librarianService.deleteById(Long.valueOf(1));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme