package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Domain.CourseType;

public interface CourseTypeRepository extends JpaRepository<CourseType, Long> {

}
