package com.mir.dto;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping(path = "api/v1")
public class SchoolController {


    private final SchoolRepository schoolRepository;

    public SchoolController(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    @PostMapping("/schools")
    public School save(@RequestBody School school) {
        return schoolRepository.save(school);
    }

    @GetMapping("/schools")
    public List<School> findAll() {
        return schoolRepository.findAll();
    }

}
