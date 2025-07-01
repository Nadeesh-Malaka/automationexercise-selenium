import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginInvalidTest extends BaseTest {

    @Test
    public void testLoginWithInvalidCredentials() {

        // Step 4: Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        System.out.println("✅ Step 4 - Clicked on 'Signup / Login' button");

        // Step 5: Verify 'Login to your account' is visible
        WebElement loginHeader = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        Assert.assertTrue(loginHeader.isDisplayed(), "❌ 'Login to your account' is not visible");
        System.out.println("✅ Step 5 - 'Login to your account' is visible");

        // Step 6: Enter incorrect email and password
        driver.findElement(By.name("email")).sendKeys("invaliduser@mail.com");
        driver.findElement(By.name("password")).sendKeys("wrongpassword");
        System.out.println("✅ Step 6 - Entered incorrect email and password");

        // Step 7: Click 'login' button
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        System.out.println("✅ Step 7 - Clicked 'Login' button");

        // Step 8: Verify error message is visible
        WebElement errorMsg = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String boldText = (String) js.executeScript("return arguments[0].innerText;", errorMsg);
        System.out.println("✅ Step 8 - Error '" +boldText + "' is visible");

        System.out.println("\n===== ✅ Test Case 3: Completed Successfully =====\n");
    }
}
