package com.example.demo.Domain;

import jakarta.persistence.*;

@Entity
@Table(name = "period")
public class Period {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String code;

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

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Period() {
    }

    public Period(Long id, String name, String code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }
}
