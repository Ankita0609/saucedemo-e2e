🚀 Sauce Demo Automation Framework


🧪 Overview

This project contains an automation test framework built for the Sauce Demo web application (https://www.saucedemo.com).
It follows a scalable and maintainable structure suitable for real-world automation including:

Page Object Model (POM)

TestNG execution control

Modular and reusable code structure

The goal is to validate core user flows including login, product selection, cart functionality, and checkout.

🛠️ Tech Stack
Component	Technology
Language	Java
Automation Tool	Selenium WebDriver
Test Runner	TestNG
Build Tool	Maven
Framework Pattern	Page Object Model (POM)
📁 Project Structure
SauceDemo-Automation/
│── src
│   ├── main/java
│   │   └── pages/            # Page object classes
│   ├── test/java
│   │   ├── tests/            # Test classes
│   │   └── utilities/        # Driver, config, helpers
│
├── drivers/
├── test-data/
├── testng.xml
├── pom.xml
└── README.md

▶️ How to Run the Tests
1️⃣ Clone the repository
git clone https://github.com/<your-username>/<repo-name>.git

2️⃣ Install dependencies
mvn clean install

3️⃣ Run Tests
mvn test


OR using TestNG XML:

mvn -DsuiteXmlFile=testng.xml test

🧪 Test Scenarios Included

✔ Login with valid credentials
✔ Login negative scenarios
✔ Add item to cart
✔ Remove item from cart
✔ Checkout flow
✔ Logout functionality

📊 Reporting (In Progress)

Currently, TestNG’s default report is generated under:

/test-output/


✨ Upcoming Enhancements:

Extent Reports integration for rich reporting

Automatic failure screenshots

Trend & analytics-based reporting

⚙️ CI/CD (Planned)

Future roadmap includes integrating:

GitHub Actions workflow for automated test execution

Artifacts for reports and screenshots

Notifications on build status

🔮 Future Enhancements
Feature	Status
Page Object Model	✔ Completed
TestNG Suite Setup	✔ Completed
Extent Report Integration	⏳ Planned
Selenium Grid / Parallel Execution	⏳ Planned
CI/CD using GitHub Actions	⏳ Planned
Dataset-driven testing	⏳ Planned
🤝 Contributions

Pull requests and feature suggestions are welcome.

📄 License

This project is licensed under the MIT License.

⭐ If this project helped or inspired you, consider giving it a star!
