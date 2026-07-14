package com.swati.demo.StudentServer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // to listen http incoming request
public class StudentServer {
    // 1. Store the Student - post http method
//    @PostMapping("/create")
//    public String storeStudent(@RequestBody Student student) {
//        int id = student.getId();
//        String name = student.getName();
//        int age = student.getAge();
//        String department = student.getDepartment();
//
//        return "id: " +id +
//                ", name: " +name +
//                ", age: " +age +
//                ", department: " +department;
//    }

//        return """
//                id : 1,
//                name : Palak,
//                Department : CSE,
//                age : 20
//                """;


    // 2. Read the student with id - get method


    // 3. Update the student information - put , patch http method

    //4. delete the student information - delete



}