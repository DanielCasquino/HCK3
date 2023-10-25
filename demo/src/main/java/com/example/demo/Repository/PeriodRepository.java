package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Domain.Period;

public interface PeriodRepository extends JpaRepository<Period, Long> {

}
