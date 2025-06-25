import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        // Step 1: Launch browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Step 2: Navigate to the URL
        driver.get("https://automationexercise.com/");
        System.out.println("======================================");
        System.out.println("\n🚀 Test Started: Opening AutomationExercise.com\n");
        System.out.println("✅ Step 1 - Browser launched and maximized");
        System.out.println("✅ Step 2 - Navigated to URL: https://automationexercise.com");

        // Step 3: Verify that the home page is visible
        String homepageTitle = driver.getTitle();
        if (homepageTitle.equals("Automation Exercise")) {
            Reporter.log("✅ Step 3 - Home page is visible", true);
        } else {
            Reporter.log("❌ Step 3 - Home page is not visible (Title: " + homepageTitle + ")", true);
        }
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("🧹 Browser closed after test");
            System.out.println("======================================\n");
        }
    }
}
