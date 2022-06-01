package com.corcino.bookstore.publisher.dto;

import com.corcino.bookstore.book.dto.BookSmallRequest;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Data
public class PublisherRequest {

    @NotNull @NotEmpty
    private String name;

    @NotNull @NotEmpty
    private String code;

    @NotNull @NotEmpty
    private LocalDate foundationDate;

    private List<BookSmallRequest> books;

}
