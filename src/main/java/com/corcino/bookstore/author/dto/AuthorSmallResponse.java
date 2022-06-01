package com.corcino.bookstore.author.dto;

import lombok.Data;

@Data
public class AuthorSmallResponse {

    private Long authorId;
    private String name;
    private Integer age;

}
