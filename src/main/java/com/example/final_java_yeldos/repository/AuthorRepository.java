package com.example.final_java_yeldos.repository;

import com.example.final_java_yeldos.model.Author;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {
    @PostConstruct
    public static void init() {
        System.out.println("PostConstruct starting");
    }

//    @Query("select * from Author")
//    Author findAllA();

    @PreDestroy
    public static void deinit() {
        System.out.println("PreDestroy starting");
    }
}
