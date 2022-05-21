package com.example.final_java_yeldos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studId;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private String email;
    @OneToOne
    private Department dept;
    @Column
    @Enumerated
    private RoleType roleType;
    @Column
    private String password;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Book> bookList;


    public Student(/*String image,*/ String name, String address, String email, Long studId, Department dept, RoleType roleType, String password, Set<Book> bookList) {
//        super(/*image,*/ name, address, email);
        this.name = name;
        this.address = address;
        this.email = email;
        this.studId = studId;
        this.dept = dept;
        this.roleType = roleType;
        this.password = password;
        this.bookList = bookList;
    }
}
