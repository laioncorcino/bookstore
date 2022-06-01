package com.corcino.bookstore.publisher.dto;

import com.corcino.bookstore.book.dto.BookToPublisherResponse;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class PublisherResponse {

    private Long publisherId;
    private String name;
    private String code;
    private LocalDate foundationDate;
    private List<BookToPublisherResponse> books;

}
