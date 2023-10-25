package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Domain.CourseAssessment;

public interface CourseAssessmentRepository extends JpaRepository<CourseAssessment, Long> {

}
