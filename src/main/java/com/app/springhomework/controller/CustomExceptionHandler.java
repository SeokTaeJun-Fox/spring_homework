package com.app.springhomework.controller;

import com.app.springhomework.domain.dto.ApiResponseDTO;
import com.app.springhomework.exception.PostException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(PostException.class)
    public ResponseEntity<ApiResponseDTO> handleException(PostException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(ApiResponseDTO.of(e.getMessage()));
    }
}
