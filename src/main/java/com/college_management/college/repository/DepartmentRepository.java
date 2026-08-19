package com.college_management.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.college_management.college.entity.Department;

public interface DepartmentRepository
        extends JpaRepository<Department, Long> {
}