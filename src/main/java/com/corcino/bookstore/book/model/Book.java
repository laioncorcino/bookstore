package com.corcino.bookstore.book.model;

import com.corcino.bookstore.author.model.Author;
import com.corcino.bookstore.generic.Auditable;
import com.corcino.bookstore.publisher.model.Publisher;
import com.corcino.bookstore.user.model.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Book extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookId;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false, unique = true)
    private String isbn;

    @Column(columnDefinition = "integer default 0")
    private Integer pages;

    @Column(columnDefinition = "integer default 0")
    private Integer chapters;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Author author;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Publisher publisher;

    @ManyToOne(cascade = CascadeType.MERGE)
    private User user;

}
