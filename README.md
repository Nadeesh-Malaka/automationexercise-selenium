# 🚀 Selenium Java Automation Project – automationexercise.com

This project contains UI automation tests written in **Java** using **Selenium WebDriver**, **TestNG**, and **Maven**, targeting [automationexercise.com](https://automationexercise.com), a practice website for testing learners.

---

## ✅ Test Cases Automated

1. ✅ Register new user  
2. ✅ Login with valid credentials  
3. ✅ Login with invalid credentials  
4. ✅ Logout

Each test case is implemented in a **separate class** for clarity and modularity.

---

## 🛠 Tech Stack

| Tool            | Purpose                      |
|-----------------|------------------------------|
| Java            | Programming language         |
| Selenium WebDriver | UI Automation framework  |
| TestNG          | Test framework               |
| Maven           | Dependency and project management |
| IntelliJ IDEA   | IDE used for development     |
| Git & GitHub    | Version control + portfolio  |

---

## 📂 Project Structure

```
selenium-tests/
├── pom.xml
└── src/
    └── test/
        └── java/
            └── ├── BaseTest.java
                ├── RegisterUserTest.java
                ├── LoginValidTest.java
                ├── LoginInvalidTest.java
                └── LogoutTest.java
```

---

## ▶️ How to Run Tests

You can run tests in two ways:

### 🧪 Option 1: Run from IntelliJ

- Right-click on the test class (e.g., `RegisterUserTest.java`)
- Click `Run 'RegisterUserTest'`

### 🔁 Option 2: Run via Maven (CLI)

Make sure Maven is installed and run:

```bash
mvn test
```

> This will execute tests defined in your `testng.xml` file.

---

## 💡 Best Practices Followed

- ✅ Page Object Model (optional)
- ✅ One class per test case
- ✅ Logs using `System.out.println()` or `TestNG Reporter`
- ✅ Clean assertions using `Assert`
- ✅ Modular structure with base test class

---

## 🧾 Sample Code Snippet (RegisterUserTest.java)

```java
@Test
public void testRegisterUser() {
    driver.get("https://automationexercise.com");
    System.out.println("🌐 Opened Home Page");

    driver.findElement(By.linkText("Signup / Login")).click();
    driver.findElement(By.name("name")).sendKeys("Test User");
    driver.findElement(By.xpath("//input[@data-qa='signup-email']"))
          .sendKeys("test" + System.currentTimeMillis() + "@mail.com");
    driver.findElement(By.xpath("//button[text()='Signup']")).click();

    // Add more steps here...
}
```

---

## 🧪 Logging

To track your steps clearly:

```java
System.out.println("✅ Clicked on Signup");
```

or use:

```java
Reporter.log("✅ Clicked on Signup", true);
```

---

## 🌍 How to Clone and Run This Project

```bash
git clone [https://github.com/yourusername/automationexercise-selenium.git]
cd automationexercise-selenium
mvn test
```

---

## 👨‍💻 Author

**Your Name**  
[Your LinkedIn](www.linkedin.com/in/nadeesh-chathuranga)  
[Your GitHub](https://github.com/Nadeesh-Malaka)

---

## 📃 License

This project is open-source and free to use for learning purposes.

