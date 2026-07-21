package com.swati.demo.StudentServer.Service;

import com.swati.demo.StudentServer.DTO.CreateStudentRequestDTO;
import com.swati.demo.StudentServer.DTO.CreateStudentResponseDTO;
import com.swati.demo.StudentServer.Entity.Student;
import com.swati.demo.StudentServer.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // CREATE
    public CreateStudentResponseDTO studentValidate(CreateStudentRequestDTO createStudentRequestDTO) {

        Student student = mapToStudent(createStudentRequestDTO);

        student = studentRepository.save(student);

        return mapToResponseDTO(student);
    }

    // GET
    public Student getStudentById(int id) throws IOException {

        Optional<Student> student = studentRepository.findById(id);

        if (student.isEmpty()) {
            throw new IOException("Student not found");
        }

        return student.get();
    }

    // UPDATE
    public Student updateStudent(int id, Student student) {

        Student result = studentRepository.findById(id).orElse(null);

        if (result == null) {
            return null;
        }

        if (student.getName() != null) {
            result.setName(student.getName());
        }

        if (student.getAge() > 0) {
            result.setAge(student.getAge());
        }

        result.setUpdatedAt(LocalDateTime.now());

        return studentRepository.save(result);
    }

    // DELETE
    public boolean deleteStudent(int id) {

        Student result = studentRepository.findById(id).orElse(null);

        if (result == null) {
            return false;
        }

        studentRepository.delete(result);

        return true;
    }

    private Student mapToStudent(CreateStudentRequestDTO createStudentRequestDTO) {

        Student student = new Student();

        student.setName(createStudentRequestDTO.getName());
        student.setAge(createStudentRequestDTO.getAge());
        student.setDepartment(createStudentRequestDTO.getDepartment());
        student.setCreatedAt(LocalDateTime.now());
        student.setUpdatedAt(LocalDateTime.now());

        return student;
    }

    private CreateStudentResponseDTO mapToResponseDTO(Student student) {

        CreateStudentResponseDTO createStudentResponseDTO = new CreateStudentResponseDTO();

        createStudentResponseDTO.setId(student.getId());
        createStudentResponseDTO.setName(student.getName());
        createStudentResponseDTO.setAge(student.getAge());
        createStudentResponseDTO.setDepartment(student.getDepartment());

        return createStudentResponseDTO;
    }
}