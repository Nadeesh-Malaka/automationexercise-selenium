import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginValidTest extends BaseTest {

    @Test
    public void testLoginWithValidCredentials() throws InterruptedException {

        // Step 4: Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        System.out.println("✅ Step 4 - Clicked on 'Signup / Login' button");

        // Step 5: Verify 'Login to your account' is visible
        WebElement loginHeader = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        Assert.assertTrue(loginHeader.isDisplayed(), "❌ 'Login to your account' is not visible");
        System.out.println("✅ Step 5 - 'Login to your account' is visible");

        // Step 6: Enter correct email address and password
        driver.findElement(By.name("email")).sendKeys("nadeshssjh1@gmail.com");
        driver.findElement(By.name("password")).sendKeys("1111");
        System.out.println("✅ Step 6 - Entered valid email and password");

        // Step 7: Click 'login' button
        driver.findElement(By.xpath("//button[text()='Login']")).click();
        System.out.println("✅ Step 7 - Clicked 'Login' button");

        // Step 8: Verify that 'Logged in as username' is visible
        WebElement loggedInAs = driver.findElement(By.xpath("//a[contains(text(),'Logged in as')]"));
        Assert.assertTrue(loggedInAs.isDisplayed(), "❌ 'Logged in as username' not visible");
        System.out.println("✅ Step 8 - 'Logged in as username' is visible");

        // Step 9: Click 'Delete Account' button
        driver.findElement(By.linkText("Delete Account")).click();
        System.out.println("✅ Step 9 - Clicked 'Delete Account' button");

        // Step 10: Verify that 'ACCOUNT DELETED!' is visible
        WebElement accountDeleted = driver.findElement(By.xpath("//b[text()='Account Deleted!']"));
        Assert.assertTrue(accountDeleted.isDisplayed(), "❌ 'ACCOUNT DELETED!' message not visible");
        System.out.println("✅ Step 10 - 'ACCOUNT DELETED!' is visible");

        System.out.println("\n===== ✅ Test Case 2: Completed Successfully =====\n");
    }
}
