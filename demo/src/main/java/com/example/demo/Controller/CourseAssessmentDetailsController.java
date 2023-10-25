package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Domain.CourseAssessmentDetails;
import com.example.demo.Service.CourseAssessmentDetailsService;

@RestController
@RequestMapping("/course_assessment_details")
public class CourseAssessmentDetailsController {
    @Autowired
    private CourseAssessmentDetailsService service;

    @GetMapping("")
    public ResponseEntity<List<CourseAssessmentDetails>> read() {
        return service.read();
    }

    // @GetMapping("/{id}")
    // public ResponseEntity<> search(@PathVariable Long id) {
    // return service.search(id);
    // }

    // @PostMapping
    // public ResponseEntity<> create(@RequestBody CourseAssessmentDetails data) {
    // return service.create(data);
    // }

    // @PutMapping("/{id}")
    // public ResponseEntity<> update(@RequestBody CourseAssessmentDetails data,
    // @PathVariable Long id) {
    // return service.update(id, data);
    // }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<> delete(@PathVariable Long id) {
    // return service.delete(id);
    // }
}
