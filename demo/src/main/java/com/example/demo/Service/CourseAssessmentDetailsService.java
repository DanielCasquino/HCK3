package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Domain.CourseAssessmentDetails;
import com.example.demo.Repository.*;

@Service
public class CourseAssessmentDetailsService {
    @Autowired
    private CourseAssessmentDetailsRepository repository;

    public ResponseEntity<List<CourseAssessmentDetails>> read() {
        List<CourseAssessmentDetails> query = repository.findAll();
        return new ResponseEntity<>(query, HttpStatus.OK);
    }

    public ResponseEntity<CourseAssessmentDetails> readSpecific(Long id) {
        Optional<CourseAssessmentDetails> query = repository.findById(id);
        if (query.isPresent()) {
            return new ResponseEntity<>(query.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<String> create(CourseAssessmentDetails data) {
        repository.save(data);
        return new ResponseEntity<String>("CAD created", HttpStatus.OK);
    }

    public ResponseEntity<String> update(CourseAssessmentDetails data, Long id) {
        Optional<CourseAssessmentDetails> query = repository.findById(id);
        if (query.isPresent()) {
            var instance = query.get();
            instance.setId(data.getId());
            instance.setCourseAssessment(data.getCourseAssessment());
            instance.setProfessor(data.getProfessor());
            instance.setScore(data.getScore());
            instance.setSection(data.getSection());
            instance.setSectionGroup(data.getSectionGroup());
            instance.setStudent(data.getStudent());
            repository.save(instance);
            return new ResponseEntity<>(null, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<String> delete(Long id) {
        Optional<CourseAssessmentDetails> query = repository.findById(id);
        try {
            repository.delete(query.get());
            return new ResponseEntity<>("Deleted", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Object not found", HttpStatus.NOT_FOUND);
        }
    }
}
