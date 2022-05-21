package com.example.final_java_yeldos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@NamedQueries({
        @NamedQuery(name="Author.findAll",
                query = "select a from Author a")
})
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authorId;

    @Column
    private String name;
}
