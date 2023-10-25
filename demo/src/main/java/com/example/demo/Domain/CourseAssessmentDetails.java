package com.example.demo.Domain;

import jakarta.persistence.*;

@Entity(name = "courseassessmentdetails")
public class CourseAssessmentDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String score;
    private String section;
    private Student student;
    private Professor professor;
    private CourseAssessment courseAssessment;
    private String sectionGroup;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getScore() {
        return this.score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getSection() {
        return this.section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Student getStudent() {
        return this.student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public CourseAssessment getCourseAssessment() {
        return this.courseAssessment;
    }

    public void setCourseAssessment(CourseAssessment courseAssessment) {
        this.courseAssessment = courseAssessment;
    }

    public String getSectionGroup() {
        return this.sectionGroup;
    }

    public void setSectionGroup(String sectionGroup) {
        this.sectionGroup = sectionGroup;
    }

    public CourseAssessmentDetails() {
    }

    public CourseAssessmentDetails(Long id, String score, String section, Student student, Professor professor,
            CourseAssessment courseAssessment, String sectionGroup) {
        this.id = id;
        this.score = score;
        this.section = section;
        this.student = student;
        this.professor = professor;
        this.courseAssessment = courseAssessment;
        this.sectionGroup = sectionGroup;
    }
}
