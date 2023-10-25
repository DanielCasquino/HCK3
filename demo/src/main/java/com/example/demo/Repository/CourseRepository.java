package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Domain.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
