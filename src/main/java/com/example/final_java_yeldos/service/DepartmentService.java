package com.example.final_java_yeldos.service;

import com.example.final_java_yeldos.model.Department;
import com.example.final_java_yeldos.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = false)
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department){
        return departmentRepository.save(department);
    }
    public Iterable<Department> findAllDepartment() {
        return departmentRepository.findAll();
    }

    public Optional<Department> findDepartmentById(Long id) {
        return departmentRepository.findById(id);
    }
    public Department updateById(Department department){
        return departmentRepository.save(department);
    }
    public void deleteById(Long id){
        departmentRepository.deleteById(id);
    }
}
