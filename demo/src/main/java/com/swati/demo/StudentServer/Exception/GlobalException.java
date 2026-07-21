package com.shrijal.demo.StudentServer.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

    // Runtime Exception Handler
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleRuntimeException(RuntimeException e) {

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(e.getMessage());
    }

    // Checked Exception Handler
    @ExceptionHandler(StudentCheckedException.class)
    public ResponseEntity<String> handleStudentCheckedException(StudentCheckedException e) {

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(e.getMessage());
    }

    // Checked Exception Class
    public static class StudentCheckedException extends Exception {

        public StudentCheckedException(String message) {
            super(message);
        }
    }
}