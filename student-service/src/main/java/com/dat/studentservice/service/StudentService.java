package com.dat.studentservice.service;

import com.dat.studentservice.StudentServiceApplication;
import com.dat.studentservice.entity.Student;
import com.dat.studentservice.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public void saveStudent(Student student) {
        //Todo - use a DTO instead of Student entity in the method param
        studentRepository.save(student);
    }

    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }
}
