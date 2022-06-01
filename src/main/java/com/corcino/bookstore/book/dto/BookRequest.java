package com.corcino.bookstore.book.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class BookRequest {

    @NotNull @NotEmpty
    private String name;

    @NotNull @NotEmpty
    private String isbn;

    @NotNull
    private Integer pages;

    @NotNull
    private Integer chapters;

    @NotNull @NotEmpty
    private String author;

    @NotNull @NotEmpty
    private String publisher;

    private String user;

}
