# 🚀 Test Intelligence Platform

A full-stack Test Intelligence Dashboard built using **Spring Boot, Java, REST APIs, MySQL, HTML, CSS, JavaScript, and Chart.js** to visualize test execution analytics in real time.

This project simulates how QA teams monitor automated test executions, analyze execution trends, and generate meaningful insights from regression results.

---

# 📷 Dashboard Preview

> Add screenshots here

```
/screenshots/dashboard.png
/screenshots/charts.png
/screenshots/history.png
```

---

# ✨ Features

## Dashboard

- Test Execution Summary
- Total Executions
- Total Passed Tests
- Total Failed Tests
- Total Skipped Tests
- Overall Pass Percentage

---

## Analytics

- Pie Chart
    - Passed vs Failed vs Skipped

- Bar Chart
    - Execution Trend

---

## Execution History

- Search Execution
- Sort by any column
- Pagination
- Responsive Table

---

## Backend APIs

| Method | API | Description |
|---------|-----|------------|
| POST | /api/executions | Save Test Execution |
| GET | /api/executions | Get All Executions |
| GET | /api/executions/summary | Dashboard Summary |

---

# 🛠 Tech Stack

## Backend

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven

---

## Database

- MySQL

---

## Frontend

- HTML5
- CSS3
- JavaScript
- Chart.js

---

## Tools

- Postman
- Eclipse / STS
- Git
- GitHub

---

# 📂 Project Structure

```
src
 ├── controller
 │       DashboardController
 │
 ├── service
 │       DashboardService
 │
 ├── repository
 │       TestExecutionRepository
 │
 ├── model
 │       TestExecution
 │
 ├── dto
 │       DashboardSummaryDTO
 │
 └── resources
         static
              index.html
              style.css
```

---

# 📈 Dashboard Capabilities

✔ Dashboard Summary

✔ Test Analytics

✔ Execution Trend

✔ Search Executions

✔ Sort Columns

✔ Pagination

✔ Responsive Dashboard

---

# 🚀 Getting Started

## Clone Repository

```bash
git clone https://github.com/ashokadi34/test-intelligence-platform.git
```

---

## Open Project

Import as Maven Project into Eclipse / STS.

---

## Configure Database

Create MySQL database

```
test_intelligence_platform
```

Update

```
application.properties
```

```
spring.datasource.url=jdbc:mysql://localhost:3306/test_intelligence_platform

spring.datasource.username=root

spring.datasource.password=yourpassword
```

---

## Run Application

```
mvn spring-boot:run
```

Application runs at

```
http://localhost:8080
```

---

# 📮 Sample REST API

POST

```
POST /api/executions
```

Example Request

```json
{
    "executionName":"Regression Build 45",
    "totalTests":520,
    "passedTests":505,
    "failedTests":10,
    "skippedTests":5,
    "durationSeconds":1480,
    "executionTime":"2026-06-25T21:30:00"
}
```

---

GET Summary

```
GET /api/executions/summary
```

---

GET Executions

```
GET /api/executions
```

---

# 📊 Future Enhancements

- Login Authentication
- User Management
- Execution Status Filters
- Date Range Filtering
- Export CSV
- Export PDF
- Dark Mode
- Live Auto Refresh
- Jenkins Integration
- Selenium Test Result Import
- Email Reports
- Docker Support
- CI/CD Pipeline
- AWS Deployment

---

# 🎯 Learning Outcomes

Through this project I gained practical experience in:

- Spring Boot REST API development
- Layered Architecture
- DTO Pattern
- MySQL Integration
- Frontend Dashboard Development
- Chart.js Visualization
- Pagination
- Search & Sorting
- Git & GitHub Version Control

---

# 👨‍💻 Author
**Ashok Kumar**
Software Engineer 

---

⭐ If you found this project useful, consider giving it a Star.
