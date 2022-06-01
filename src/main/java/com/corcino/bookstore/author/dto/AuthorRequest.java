package com.corcino.bookstore.author.dto;

import com.corcino.bookstore.book.dto.BookSmallRequest;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class AuthorRequest {

    @NotNull @NotEmpty
    private String name;

    @NotNull @Max(120)
    private Integer age;

    private List<BookSmallRequest> books;

}
