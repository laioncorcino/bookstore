package com.corcino.bookstore.book.dto;

import com.corcino.bookstore.author.dto.AuthorSmallResponse;
import lombok.Data;

@Data
public class BookToPublisherResponse {

    private Long bookId;
    private String name;
    private String isbn;
    private Integer pages;
    private Integer chapters;
    private AuthorSmallResponse publisher;

}
