package com.example.exception.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackages = "com.example.exception.controller")
public class GlobalControllerAdvice {

    @ExceptionHandler(value = Exception.class) // 모든 예외
    public ResponseEntity exception(Exception e) {
        System.out.println("global");
        System.out.println(e.getClass().getName());
        System.out.println(e.getMessage());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("");
    }
}
