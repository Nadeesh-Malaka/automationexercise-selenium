import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {

    @Test
    public void testLogoutUser() {

        // Step 4: Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        System.out.println("✅ Step 4 - Clicked on 'Signup / Login' button");

        // Step 5: Verify 'Login to your account' is visible
        WebElement loginHeader = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        Assert.assertTrue(loginHeader.isDisplayed(), "❌ 'Login to your account' is not visible");
        System.out.println("✅ Step 5 - 'Login to your account' is visible");

        // Step 6: Enter valid credentials
        driver.findElement(By.name("email")).sendKeys("NadeeshM10@gmail.com");
        driver.findElement(By.name("password")).sendKeys("1111");
        System.out.println("✅ Step 6 - Entered correct email and password");

        // Step 7: Click 'login' button
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        System.out.println("✅ Step 7 - Clicked 'Login' button");

        // Step 8: Verify 'Logged in as username' is visible
        WebElement loggedInAs = driver.findElement(By.xpath("//a[contains(text(),'Logged in as')]"));
        Assert.assertTrue(loggedInAs.isDisplayed(), "❌ 'Logged in as username' not visible");
        System.out.println("✅ Step 8 - 'Logged in as username' is visible");

        // Step 9: Click 'Logout' button
        driver.findElement(By.xpath("//a[@href='/logout']")).click();
        System.out.println("✅ Step 9 - Clicked 'Logout' button");

        // Step 10: Verify that user is navigated to login page
        WebElement loginPageHeader = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        Assert.assertTrue(loginPageHeader.isDisplayed(), "❌ User was not redirected to login page after logout");
        System.out.println("✅ Step 10 - Navigated back to login page after logout");

        System.out.println("\n===== ✅ Test Case 4: Completed Successfully =====\n");
    }
}
