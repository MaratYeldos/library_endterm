package com.example.final_java_yeldos.repository;

import com.example.final_java_yeldos.model.Librarian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibrarianRepository extends JpaRepository<Librarian,Long> {
}
