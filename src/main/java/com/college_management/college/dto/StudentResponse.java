package com.college_management.college.dto;

public class StudentResponse {

    private Long id;
    private String name;
    private String email;
    private Long departmentId;
    private String departmentName;

    public StudentResponse() {
    }

    public StudentResponse(
            Long id,
            String name,
            String email,
            Long departmentId,
            String departmentName) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}