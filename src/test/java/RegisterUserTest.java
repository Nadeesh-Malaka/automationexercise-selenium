import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterUserTest {

    WebDriver driver;

    @BeforeMethod
    public void OpenWebPage() throws InterruptedException{
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/");
        System.out.println("Browser Launched");
        Thread.sleep(500);
    }

    @Test
    public void RegisterUser() throws InterruptedException {
        WebElement signupbutton = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]"));
        signupbutton.click();
        Thread.sleep(2000);
        WebElement user_name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
        WebElement user_email = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
        user_name.sendKeys("Nadeesh1212");
        user_email.sendKeys("nadeeshtest12@gmail.com");
        WebElement Signup_button = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
        Signup_button.click();

    }
}
