package com.swati.demo.StudentServer.Service;

import com.swati.demo.StudentServer.Entity.Student;
import com.swati.demo.StudentServer.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // CREATE
    public Student studentValidate(Student student) {

        if (student.getName() == null || student.getName().isBlank()
                || student.getDepartment() == null || student.getDepartment().isBlank()
                || student.getAge() <= 0) {
            return null;
        }

        return studentRepository.save(student);
    }

    // GET
    public Student getStudentById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    // UPDATE
    public Student updateStudent(int id, Student student) {

        Student existingStudent = studentRepository.findById(id).orElse(null);

        if (existingStudent == null) {
            return null;
        }

        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        existingStudent.setDepartment(student.getDepartment());

        return studentRepository.save(existingStudent);
    }

    // DELETE
    public boolean deleteStudent(int id) {

        Student existingStudent = studentRepository.findById(id).orElse(null);

        if (existingStudent == null) {
            return false;
        }

        studentRepository.delete(existingStudent);
        return true;
    }
}