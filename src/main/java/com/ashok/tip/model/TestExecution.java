package com.ashok.tip.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "test_execution")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TestExecution {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String executionName;

    private Integer totalTests;

    private Integer passedTests;

    private Integer failedTests;

    private Integer skippedTests;

    private Integer durationSeconds;

    private LocalDateTime executionTime;
}