package com.college_management.college.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.college_management.college.entity.Department;
import com.college_management.college.repository.DepartmentRepository;

@ExtendWith(MockitoExtension.class)
public class DepartmentServiceTest {
    
    @Mock
    private DepartmentRepository departmentRepository;

    @InjectMocks
    private DepartmentService departmentService;

    @Test
    void shouldCreateDepartment(){

        Department department = new Department();
        department.setName("Botany");

        Department savedDepartment = new Department();
        savedDepartment.setId(1L);
        savedDepartment.setName("Botany");

        when(departmentRepository.save(department)).thenReturn(savedDepartment);

        Department result = departmentService.createDepartment(department);
        assertEquals(1L, result.getId());
        assertEquals("Botany", result.getName());

        verify(departmentRepository).save(department);
    }

  

}
