package com.ashok.tip.service;

import com.ashok.tip.model.TestExecution;
import com.ashok.tip.repository.TestExecutionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardService {

    private final TestExecutionRepository repository;

    public DashboardService(TestExecutionRepository repository) {
        this.repository = repository;
    }

    public TestExecution save(TestExecution execution) {
        return repository.save(execution);
    }

    public List<TestExecution> getAllExecutions() {
        return repository.findAll();
    }
}