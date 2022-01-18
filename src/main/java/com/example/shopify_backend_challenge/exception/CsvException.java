package com.example.shopify_backend_challenge.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CsvException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public CsvException(String message) {
        super(message);
    }
}
