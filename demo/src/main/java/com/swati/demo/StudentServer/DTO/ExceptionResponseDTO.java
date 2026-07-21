package com.swati.demo.StudentServer.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ExceptionResponseDTO {
    private LocalDateTime timestamp;
    private int statuscode;
    private String error;
    private String message;
    private String path;
}
