package com.swati.demo.StudentServer.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateStudentRequestDTO {

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @Min(value = 0, message = "Age cannot be negative")
    private int age;

    @NotBlank(message = "Email cannot be empty")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Department cannot be empty")
    private String department;
}