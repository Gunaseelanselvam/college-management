package com.college_management.college.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.college_management.college.dto.StudentRequest;
import com.college_management.college.dto.StudentResponse;
import com.college_management.college.entity.Student;
import com.college_management.college.service.StudentService;

import io.micrometer.core.ipc.http.HttpSender.Response;


@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<StudentResponse> createStudent(@RequestBody StudentRequest request){

        StudentResponse savedStudent = studentService.createStudent(request);
        return ResponseEntity.ok(savedStudent);

    }
    
}
