package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;



    public void saveStudent(Student student){
        studentRepository.save(student);
    }

}
