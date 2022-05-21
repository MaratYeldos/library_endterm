package com.example.final_java_yeldos.model;

//import jdk.jfr.Category;
//import jdk.jfr.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;
    @Column
    private String bookName;
    @OneToMany
    private Set<Author> authorlist;
//    @OneToOne
//    private Category category;

}
