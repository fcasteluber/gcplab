package com.example.gcplab.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gcplab.courses.bean.Course;

@RestController
public class CourseController {

    //http://localhost:8080/courses
    @GetMapping("/courses")
    public List<Course> getAllCourses()
    {
        return Arrays.asList(new Course(1, "GCP Microservice2", "fcasteluber"));
    }

}
