package com.corcino.bookstore.user.dto;

import com.corcino.bookstore.book.dto.BookResponse;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class UserResponse {

    private Long userId;
    private String name;
    private String gender;
    private String email;
    private LocalDate birthDate;
    private List<BookResponse> books;

}
