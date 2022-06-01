package com.corcino.bookstore.user.dto;

import com.corcino.bookstore.book.dto.BookSmallRequest;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.List;

@Data
public class UserRequest {

    @NotNull @NotEmpty
    private String name;

    @NotNull @NotEmpty
    @Pattern(regexp = "MALE|FEMALE", message = "Invalid gender type")
    private String gender;

    @NotNull @NotEmpty
    private String email;

    @NotNull @NotEmpty
    private String username;

    @NotNull @NotEmpty
    private String password;

    @NotNull @NotEmpty
    private LocalDate birthDate;

    private List<BookSmallRequest> books;

}
