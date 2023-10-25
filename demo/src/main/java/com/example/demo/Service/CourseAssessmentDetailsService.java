package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.demo.Domain.CourseAssessmentDetails;
import com.example.demo.Repository.*;

public class CourseAssessmentDetailsService {
    @Autowired
    private CourseAssessmentDetailsRepository repository;

    public ResponseEntity<List<CourseAssessmentDetails>> read() {
        List<CourseAssessmentDetails> query = repository.findAll();
        return new ResponseEntity<>(query, HttpStatus.OK);
    }
}
