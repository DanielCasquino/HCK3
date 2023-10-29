package com.example.demo.Domain;

import jakarta.persistence.*;

@Entity
@Table(name = "coursetype")
public class CourseType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CourseType() {
    }

    public CourseType(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
