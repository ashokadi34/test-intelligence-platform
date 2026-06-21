package com.ashok.tip.repository;

import com.ashok.tip.model.TestExecution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TestExecutionRepository
        extends JpaRepository<TestExecution, Long> {

    @Query("SELECT COALESCE(SUM(t.passedTests),0) FROM TestExecution t")
    Integer getTotalPassed();

    @Query("SELECT COALESCE(SUM(t.failedTests),0) FROM TestExecution t")
    Integer getTotalFailed();

    @Query("SELECT COALESCE(SUM(t.skippedTests),0) FROM TestExecution t")
    Integer getTotalSkipped();
}