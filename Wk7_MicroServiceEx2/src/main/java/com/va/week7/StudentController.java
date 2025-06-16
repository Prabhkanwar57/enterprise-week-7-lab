package com.va.week7;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent() {
        return new Student(
            "n01652796",
            "Prabhkanwar Sabharwal",
            "Prabhkanwar",
            "Sabhrwal",
            "1234567890",
            "2001-09-01",
            "12, Countryman, Toronto"
        );
    }
}