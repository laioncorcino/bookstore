package com.corcino.bookstore.book.dto;

import com.corcino.bookstore.author.dto.AuthorSmallResponse;
import com.corcino.bookstore.publisher.dto.PublisherSmallResponse;
import lombok.Data;

@Data
public class BookResponse {

    private Long bookId;
    private String name;
    private String isbn;
    private Integer pages;
    private Integer chapters;
    private AuthorSmallResponse author;
    private PublisherSmallResponse publisher;

}
