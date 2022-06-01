package com.corcino.bookstore.error;

import com.corcino.bookstore.error.StandardError;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class ValidationError extends StandardError {

    private String field;

}
