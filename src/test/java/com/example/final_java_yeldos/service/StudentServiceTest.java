package com.example.final_java_yeldos.service;

import com.example.final_java_yeldos.model.*;
import com.example.final_java_yeldos.repository.StudentRepository;
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

class StudentServiceTest {
    @Mock
    StudentRepository studentRepository;
    @InjectMocks
    StudentService studentService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testSaveStudent() {
        Student result = studentService.saveStudent(new Student("name", "address", "email", Long.valueOf(1), new Department(Long.valueOf(1), "deptName"), RoleType.ROLE_CLIENT, "password", new HashSet<Book>(Arrays.asList(new Book(Long.valueOf(1), "bookName", new HashSet<Author>(Arrays.asList(new Author(Long.valueOf(1), "name"))))))));
        Assertions.assertNotEquals(new Student("name", "address", "email", Long.valueOf(1), new Department(Long.valueOf(1), "deptName"), RoleType.ROLE_CLIENT, "password", new HashSet<Book>(Arrays.asList(new Book(Long.valueOf(1), "bookName", new HashSet<Author>(Arrays.asList(new Author(Long.valueOf(1), "name"))))))), result);
    }

    @Test
    void testFindAllStudent() {
        Iterable<Student> result = studentService.findAllStudent();
        Assertions.assertNotEquals(null, result);
    }

    @Test
    void testFindStudentById() {
        Optional<Student> result = studentService.findStudentById(Long.valueOf(1));
        Assertions.assertNotEquals(null, result);
    }

    @Test
    void testUpdateById() {
        Student result = studentService.updateById(new Student("name", "address", "email", Long.valueOf(1), new Department(Long.valueOf(1), "deptName"), RoleType.ROLE_CLIENT, "password", new HashSet<Book>(Arrays.asList(new Book(Long.valueOf(1), "bookName", new HashSet<Author>(Arrays.asList(new Author(Long.valueOf(1), "name"))))))));
        Assertions.assertNotEquals(new Student("name", "address", "email", Long.valueOf(1), new Department(Long.valueOf(1), "deptName"), RoleType.ROLE_CLIENT, "password", new HashSet<Book>(Arrays.asList(new Book(Long.valueOf(1), "bookName", new HashSet<Author>(Arrays.asList(new Author(Long.valueOf(1), "name"))))))), result);
    }

    @Test
    void testDeleteById() {
        studentService.deleteById(Long.valueOf(1));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme