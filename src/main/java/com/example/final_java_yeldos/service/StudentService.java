package com.example.final_java_yeldos.service;

import com.example.final_java_yeldos.model.Student;
import com.example.final_java_yeldos.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
    public Iterable<Student> findAllStudent() {
        return studentRepository.findAll();
    }

    public Optional<Student> findStudentById(Long id) {
        return studentRepository.findById(id);
    }
    public Student updateById(Student student){
        return studentRepository.save(student);
    }
    public void deleteById(Long id){
        studentRepository.deleteById(id);
    }
}
