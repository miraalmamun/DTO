package com.mir.dto;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity(name = "StudentProfile")
@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student_profile")
public class StudentProfile {

    @Id
    @GeneratedValue
    private Integer id;
    private String bio;
    @OneToOne
    @JoinColumn(name = "student_id")
    @JsonBackReference
    private Student student;

    public StudentProfile(String bio) {
        this.bio = bio;
    }



}
