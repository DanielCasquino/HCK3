package com.example.demo;

import jakarta.persistence.*;

@Entity(name = "courseassessment")
public class CourseAssessment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Course course;
    private Period period;
    private String title;
    private String markingType;
    private String markingNumber;
    private String nomenclature;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Period getPeriod() {
        return this.period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMarkingType() {
        return this.markingType;
    }

    public void setMarkingType(String markingType) {
        this.markingType = markingType;
    }

    public String getMarkingNumber() {
        return this.markingNumber;
    }

    public void setMarkingNumber(String markingNumber) {
        this.markingNumber = markingNumber;
    }

    public String getNomenclature() {
        return this.nomenclature;
    }

    public void setNomenclature(String nomenclature) {
        this.nomenclature = nomenclature;
    }

    public CourseAssessment() {
    }

    public CourseAssessment(Long id, Course course, Period period, String title, String markingType,
            String markingNumber, String nomenclature) {
        this.id = id;
        this.course = course;
        this.period = period;
        this.title = title;
        this.markingType = markingType;
        this.markingNumber = markingNumber;
        this.nomenclature = nomenclature;
    }
}
