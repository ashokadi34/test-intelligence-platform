package com.ashok.tip.repository;

import com.ashok.tip.model.TestExecution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestExecutionRepository
        extends JpaRepository<TestExecution, Long> {
}