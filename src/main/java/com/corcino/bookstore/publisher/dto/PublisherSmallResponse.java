package com.corcino.bookstore.publisher.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PublisherSmallResponse {

    private Long publisherId;
    private String name;
    private String code;
    private LocalDate foundationDate;

}
