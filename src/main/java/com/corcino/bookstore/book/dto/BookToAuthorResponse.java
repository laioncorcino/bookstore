package com.corcino.bookstore.book.dto;

import com.corcino.bookstore.publisher.dto.PublisherSmallResponse;
import lombok.Data;

@Data
public class BookToAuthorResponse {

    private Long bookId;
    private String name;
    private String isbn;
    private Integer pages;
    private Integer chapters;
    private PublisherSmallResponse publisher;

}
