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
    private CourseAssessmentDetailsService serv;

    @GetMapping("")
    public ResponseEntity<List<CourseAssessmentDetails>> read() {
        return serv.read();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CourseAssessmentDetails> search(@PathVariable Long id) {
        return serv.readSpecific(id);
    }

    @PostMapping
    public ResponseEntity<String> create(@RequestBody CourseAssessmentDetails data) {
        return serv.create(data);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> update(@RequestBody CourseAssessmentDetails data, @PathVariable Long id) {
        return serv.update(data, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        return serv.delete(id);
    }
}
