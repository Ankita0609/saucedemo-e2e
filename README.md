# 🧪 SauceDemo End-to-End Test Automation Framework

A **production-style end-to-end UI automation framework** built using **Selenium + TestNG + Maven**, fully integrated with **Jenkins CI** and designed to run reliably in **headless environments**.

This project demonstrates **real-world QA automation engineering skills**, including framework design, CI troubleshooting, browser environment control, and maintainable test architecture.

---

## 🚀 What This Project Demonstrates

This is **not** a demo project. It showcases how modern QA automation is actually implemented in real teams:

- ✅ End-to-end user journey validation (Login → Cart → Checkout)
- ✅ Page Object Model (POM) for maintainability
- ✅ Explicit wait strategy for stable UI automation
- ✅ Browser-level popup handling (Chrome security/password dialogs)
- ✅ Headless execution for CI environments
- ✅ Jenkins Pipeline-as-Code (Jenkinsfile)
- ✅ Clean Maven dependency & scope management
- ✅ Screenshot capture on test failure
- ✅ CI-ready, reproducible builds (no local-only dependencies)

---

## 🏗️ Framework Architecture

saucedemo-e2e/
│
├── src/main/java
│ ├── core
│ │ ├── DriverFactory.java # Thread-safe WebDriver lifecycle
│ │ ├── BaseTest.java # Test lifecycle management
│ │ └── TestListener.java # Failure handling & screenshots
│ │
│ ├── config
│ │ └── ConfigReader.java # Externalized configuration
│ │
│ ├── pages
│ │ ├── LoginPage.java
│ │ ├── InventoryPage.java
│ │ ├── CartPage.java
│ │ └── CheckoutPage.java
│ │
│ └── utils
│ ├── WaitUtils.java # Explicit wait utilities
│ └── ScreenshotUtils.java # Failure screenshots
│
├── src/test/java
│ └── tests
│ ├── LoginTests.java
│ └── CheckoutFlowTest.java
│
├── src/main/resources
│ └── config.properties # Browser & environment config
│
├── screenshots/ # CI failure artifacts
├── testng.xml # Controlled test execution
├── Jenkinsfile # Jenkins pipeline definition
├── pom.xml # Maven build configuration
└── README.md

---

## 🧠 Design Decisions (Why This Matters)

### Page Object Model (POM)
- Separates **test logic** from **UI locators**
- Improves maintainability and readability
- Industry-standard approach for UI automation

### Explicit Wait Strategy
- No `Thread.sleep()`
- Prevents flaky tests
- Synchronizes test actions with real UI behavior

### Browser Environment Control
- Chrome password & security popups disabled at startup
- Prevents CI and headless execution failures
- Demonstrates real-world automation problem solving

### Headless Execution
- Required for CI/CD pipelines
- Ensures tests run on clean machines without GUI
- Controlled via `config.properties`

---

## 🧪 Test Coverage

### ✔️ Login Flow
- Valid user authentication
- Navigation validation

### ✔️ End-to-End Checkout Flow
- Add item to cart
- Cart state validation
- Checkout form submission
- Order confirmation verification

These tests validate **business-critical user journeys**, not just isolated UI actions.

---

## ⚙️ Configuration Management

All runtime behavior is controlled externally:

```properties
browser=chrome
headless=true
baseUrl=https://www.saucedemo.com
This allows:

Seamless local ↔ CI execution

No code changes per environment

Clean separation of logic and configuration

🔁 CI/CD Integration (Jenkins)

This project is fully integrated with Jenkins CI using Pipeline-as-Code.

Jenkins Pipeline Capabilities

Automated checkout from GitHub

Maven build & test execution

Headless browser execution on Windows agents

Screenshot archiving on test failure

Test result publishing via Surefire reports

Jenkinsfile (Key Principle)
pipeline {
    agent any
    tools {
        jdk 'JDK11'
        maven 'Maven3'
    }
    stages {
        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
}


This mirrors real enterprise CI pipelines.

🛠️ Tech Stack & Skills Demonstrated
Automation & Testing

Selenium WebDriver

TestNG

Page Object Model (POM)

Explicit waits & synchronization

Failure analysis & debugging

Build & Dependency Management

Maven

Dependency scope management

CI-safe project structure

CI/CD

Jenkins (Pipeline-as-Code)

GitHub integration

Headless execution

Artifact archiving

Engineering Practices

Clean architecture

Reproducible builds

Environment isolation

CI-first mindset

▶️ How to Run Locally
mvn clean test


To run with visible browser:

headless=false

📌 Why This Project Stands Out

Most automation projects:

Run only in IDE

Break in CI

Ignore browser environment issues

Rely on local machine state

This project:

Runs on clean machines

Is CI-stable

Handles real-world browser problems

Follows industry-grade automation practices

👤 Author

Ankita Singh
QA Automation Engineer | Selenium | TestNG | CI/CD | Jenkins
