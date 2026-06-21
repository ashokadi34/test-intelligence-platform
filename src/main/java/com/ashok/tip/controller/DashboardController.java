package com.ashok.tip.controller;

import com.ashok.tip.model.TestExecution;
import com.ashok.tip.service.DashboardService;
import org.springframework.web.bind.annotation.*;
import com.ashok.tip.dto.DashboardSummaryDTO;

import java.util.List;

@RestController
@RequestMapping("/api/executions")
public class DashboardController {

    private final DashboardService dashboardService;

    public DashboardController(DashboardService dashboardService) {
        this.dashboardService = dashboardService;
    }

    @PostMapping
    public TestExecution saveExecution(@RequestBody TestExecution execution) {
        return dashboardService.save(execution);
    }

    @GetMapping
    public List<TestExecution> getExecutions() {
        return dashboardService.getAllExecutions();
    }
    @GetMapping("/summary")
    public DashboardSummaryDTO getSummary() {
        return dashboardService.getSummary();
    }
}