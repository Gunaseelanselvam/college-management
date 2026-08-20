package com.college_management.college.service;
import org.springframework.stereotype.Service;

import com.college_management.college.dto.StudentRequest;
import com.college_management.college.entity.Department;
import com.college_management.college.entity.Student;
import com.college_management.college.repository.DepartmentRepository;
import com.college_management.college.repository.StudentRepository;


@Service

public class StudentService{

    private final StudentRepository studentRepository;
    private final DepartmentRepository departmentRepository;

    public StudentService(StudentRepository studentRepository, DepartmentRepository departmentRepository){
        this.studentRepository = studentRepository;
        this.departmentRepository = departmentRepository;
    }

    public Student createStudent(StudentRequest request){


        Department department = departmentRepository
                            .findById(request.getDepartmentId())
                            .orElseThrow(() -> new RuntimeException("Department not found"));

        Student student = new Student();
        student.setName(request.getName());
        student.setEmail(request.getEmail());
        student.setDepartment(department);

        return studentRepository.save(student);
    }
}
