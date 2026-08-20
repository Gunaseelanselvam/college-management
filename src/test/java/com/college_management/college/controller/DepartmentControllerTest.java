package com.college_management.college.controller;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.college_management.college.entity.Department;
import com.college_management.college.service.DepartmentService;

@WebMvcTest(DepartmentController.class)
public class DepartmentControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private DepartmentService departmentService;

    @Test
    void shouldCreateDepartment() throws Exception{

        Department savedDepartment = new Department();
        savedDepartment.setId(1L);
        savedDepartment.setName("Computer Science");

        when(departmentService.createDepartment(any(Department.class))).thenReturn(savedDepartment);

        mockMvc.perform(
                post("/api/departments")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("""
                    {
                        "name":"Computer Science"
                        }
                            """))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.id").value(1))
        .andExpect(jsonPath("$.name").value("Computer Science"));
    }  

    
}
