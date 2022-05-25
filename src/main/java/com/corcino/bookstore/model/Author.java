package com.corcino.bookstore.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long authorId;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(columnDefinition = "integer default 0")
    private Integer age;

    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private List<Book> books;

}
