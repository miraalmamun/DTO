package com.mir.dto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping(path = "api/v1")
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping("/students")
    public Student save(@RequestBody Student student) {
        System.out.println("Saving student: " + student);
        Student savedStudent = studentRepository.save(student);
        System.out.println("Saved student: " + savedStudent);
        return savedStudent;
    }

    @GetMapping("/students")
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

}
