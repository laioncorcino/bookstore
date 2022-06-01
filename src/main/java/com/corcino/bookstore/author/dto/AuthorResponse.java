package com.corcino.bookstore.author.dto;

import com.corcino.bookstore.book.dto.BookToAuthorResponse;
import lombok.Data;

import java.util.List;

@Data
public class AuthorResponse {

    private Long authorId;
    private String name;
    private Integer age;
    private List<BookToAuthorResponse> books;

}
