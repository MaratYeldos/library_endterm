package com.example.final_java_yeldos.service;

import com.example.final_java_yeldos.model.Librarian;
import com.example.final_java_yeldos.repository.LibrarianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LibrarianService {
    @Autowired
    private LibrarianRepository librarianRepository;

    public Librarian saveLibrarian(Librarian librarian){
        return librarianRepository.save(librarian);
    }
    public Iterable<Librarian> findAllLibrarian() {
        return librarianRepository.findAll();
    }

    public Optional<Librarian> findLibrarianById(Long id) {
        return librarianRepository.findById(id);
    }
    public Librarian updateById(Librarian librarian){
        return librarianRepository.save(librarian);
    }
    public void deleteById(Long id){
        librarianRepository.deleteById(id);
    }
}
