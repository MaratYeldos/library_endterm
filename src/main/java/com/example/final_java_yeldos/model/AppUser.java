package com.example.final_java_yeldos.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(min = 4, max = 255, message = "Minimum username length: 4 characters")
    @Column(unique = true, nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    @Size(min = 8, message = "Minimum password length: 6 characters")
    private String password;

    private String token;
    private boolean accountVerified;

    //new fields
    private int failedLoginAttempts;
    private boolean loginDisabled;

    @ElementCollection(fetch = FetchType.EAGER)
    List<RoleType> appUserRoles;


}
