package com.college_management.college.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class Department{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

   
    @OneToMany(mappedBy = "department")
    private List<Student> students;


    public void setStudents(List<Student> students){
        this.students = students;
    }

    public List<Student> getStudents(){
        return students;
    }


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