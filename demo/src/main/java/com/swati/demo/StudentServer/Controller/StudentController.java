package com.swati.demo.StudentServer.Controller;

import com.swati.demo.StudentServer.Entity.Student;
import com.swati.demo.StudentServer.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // CREATE
    @PostMapping("/create")
    public ResponseEntity<Student> storeStudent(@RequestBody Student student) {

        Student result = studentService.studentValidate(student);

        if (result == null) {
            return ResponseEntity.badRequest().body(null);
        }

        return ResponseEntity.status(201).body(result);
    }

    // GET BY ID
    @GetMapping("/get/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable int id) {

        Student student = studentService.getStudentById(id);

        if (student == null) {
            return ResponseEntity.status(404).body("Student not found");
        }

        return ResponseEntity.ok(student);
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateStudent(@PathVariable int id,
                                           @RequestBody Student student) {

        Student updatedStudent = studentService.updateStudent(id, student);

        if (updatedStudent == null) {
            return ResponseEntity.status(404).body("Student not found");
        }

        return ResponseEntity.ok(updatedStudent);
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable int id) {

        boolean deleted = studentService.deleteStudent(id);

        if (!deleted) {
            return ResponseEntity.status(404).body("Student not found");
        }

        return ResponseEntity.ok("Student deleted successfully");
    }
}