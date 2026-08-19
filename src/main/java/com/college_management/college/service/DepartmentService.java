package com.college_management.college.service;
import org.springframework.stereotype.Service;

import com.college_management.college.entity.Department;
import com.college_management.college.repository.DepartmentRepository;
import java.util.List;


@Service
public class DepartmentService{

    final DepartmentRepository departmentRepository;

   public  DepartmentService (DepartmentRepository departmentRepository){
        this.departmentRepository = departmentRepository;
    }


   public Department createDepartment(Department department){
        return departmentRepository.save(department);
    }

    public  List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }

}
