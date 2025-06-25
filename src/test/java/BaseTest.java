import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        //1. Launch browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Navigate to url 'http://automationexercise.com'
        driver.get("https://automationexercise.com/");
        System.out.println("......................................\n");
        System.out.println("Step 1 - Browser Launched and navigate to the url");


        //3.Verify that home page is visible successfully
        String homepage = driver.getTitle();
        if(homepage.equals("Automation Exercise")){
            Reporter.log("Home page is visible", true);
        } else {
            Reporter.log("Home page is not visible", true);
        }

    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}
