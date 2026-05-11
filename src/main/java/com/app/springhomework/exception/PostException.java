package com.app.springhomework.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class PostException extends RuntimeException {

    private HttpStatus status;

    public PostException() {;}
    public PostException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
