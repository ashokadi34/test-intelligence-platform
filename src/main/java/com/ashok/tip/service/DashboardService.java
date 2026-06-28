package com.ashok.tip.service;

import com.ashok.tip.model.TestExecution;
import com.ashok.tip.repository.TestExecutionRepository;
import org.springframework.stereotype.Service;

import com.ashok.tip.dto.DashboardSummaryDTO;

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
    
    public DashboardSummaryDTO getSummary() {

        List<TestExecution> executions = repository.findAll();

        long totalExecutions = executions.size();

        int totalPassed =
                executions.stream()
                        .mapToInt(TestExecution::getPassedTests)
                        .sum();

        int totalFailed =
                executions.stream()
                        .mapToInt(TestExecution::getFailedTests)
                        .sum();

        int totalSkipped =
                executions.stream()
                        .mapToInt(TestExecution::getSkippedTests)
                        .sum();

        int totalTests =
                totalPassed + totalFailed + totalSkipped;

        double passPercentage = 0;

        if (totalTests > 0) {
        	passPercentage =
        	        Math.round(
        	                ((double) totalPassed / totalTests) * 10000
        	        ) / 100.0;
        }

        return new DashboardSummaryDTO(
                totalExecutions,
                totalPassed,
                totalFailed,
                totalSkipped,
                passPercentage
        );
    }
}