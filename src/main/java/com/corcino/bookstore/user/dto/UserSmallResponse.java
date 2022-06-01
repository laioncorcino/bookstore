package com.corcino.bookstore.user.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserSmallResponse {

    private Long userId;
    private String name;
    private String gender;
    private String email;
    private LocalDate birthDate;

}
