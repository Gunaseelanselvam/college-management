package com.college_management.college.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.college_management.college.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long>{

    
}