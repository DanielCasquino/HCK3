package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Domain.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
