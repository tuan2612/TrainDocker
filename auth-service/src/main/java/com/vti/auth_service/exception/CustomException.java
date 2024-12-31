package com.vti.auth_service.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class CustomException extends Exception {
    private final HttpStatus status;

    public CustomException(HttpStatus status,String message) {
        super(message);
        this.status = status;
    }
}
