package com.ashok.tip.dto;

public class DashboardSummaryDTO {

    private long totalExecutions;
    private int totalPassed;
    private int totalFailed;
    private int totalSkipped;
    private double passPercentage;

    public DashboardSummaryDTO() {
    }

    public DashboardSummaryDTO(
            long totalExecutions,
            int totalPassed,
            int totalFailed,
            int totalSkipped,
            double passPercentage) {

        this.totalExecutions = totalExecutions;
        this.totalPassed = totalPassed;
        this.totalFailed = totalFailed;
        this.totalSkipped = totalSkipped;
        this.passPercentage = passPercentage;
    }

    public long getTotalExecutions() {
        return totalExecutions;
    }

    public int getTotalPassed() {
        return totalPassed;
    }

    public int getTotalFailed() {
        return totalFailed;
    }

    public int getTotalSkipped() {
        return totalSkipped;
    }

    public double getPassPercentage() {
        return passPercentage;
    }
}