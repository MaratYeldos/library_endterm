package com.example.final_java_yeldos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Librarian {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long LibrarianId;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private String email;
    @Column
    @Enumerated
    private RoleType roleType;
    @Column
    private String librarianPassword;

    public Librarian(/*String image,*/ String name, String address, String email, Long librarianId, RoleType roleType, String librarianPassword) {
//        super(/*image,*/ name, address, email);
        this.name = name;
        this.address = address;
        this.email = email;
        this.LibrarianId = librarianId;
        this.roleType = roleType;
        this.librarianPassword = librarianPassword;
    }
}
