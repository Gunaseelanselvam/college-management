package com.college_management.college.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Department(){

    }

    public void setId(Long id){
        this.id = id;
    }



    public Long getId(){
        return id;
    }

    public void setName(String name ){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Object thenReturn(Department savedDepartment) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'thenReturn'");
    }


}