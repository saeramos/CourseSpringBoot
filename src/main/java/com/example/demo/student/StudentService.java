package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository){//Contructor
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudent(){//listado estudiantes
        return studentRepository.findAll();
    }

}