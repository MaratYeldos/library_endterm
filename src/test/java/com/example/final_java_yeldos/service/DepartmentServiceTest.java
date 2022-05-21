package com.example.final_java_yeldos.service;

import com.example.final_java_yeldos.model.Department;
import com.example.final_java_yeldos.repository.DepartmentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.mockito.Mockito.*;

class DepartmentServiceTest {
    @Mock
    DepartmentRepository departmentRepository;
    @InjectMocks
    DepartmentService departmentService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testSaveDepartment() {
        Department result = departmentService.saveDepartment(new Department(Long.valueOf(1), "deptName"));
        Assertions.assertEquals(new Department(Long.valueOf(1), "deptName"), result);
    }

    @Test
    void testFindAllDepartment() {
        Iterable<Department> result = departmentService.findAllDepartment();
        Assertions.assertNotEquals(null, result);
    }

    @Test
    void testFindDepartmentById() {
        Optional<Department> result = departmentService.findDepartmentById(Long.valueOf(1));
        Assertions.assertNotEquals(null, result);
    }

    @Test
    void testUpdateById() {
        Department result = departmentService.updateById(new Department(Long.valueOf(1), "deptName"));
        Assertions.assertNotEquals(new Department(Long.valueOf(1), "deptName"), result);
    }

    @Test
    void testDeleteById() {
        departmentService.deleteById(Long.valueOf(1));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme