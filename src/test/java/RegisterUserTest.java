import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterUserTest extends BaseTest{

    //1)Test case 01 - Register User

    @Test
    public void RegisterUser() throws InterruptedException {

        //4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]")).click();

        // Step 5. Verify 'New User Signup!' is visible
        boolean newUserVisible = driver.findElement(By.xpath("//h2[text()='New User Signup!']")).isDisplayed();
        if (newUserVisible) {
            System.out.println("✅ Step 4 - New User Signup! is visible");
        } else {
            System.out.println("❌ Step 4 - New User Signup! is not visible");
        }


        //6. Enter name and email address
        String username = "Nadeesh1212";
        String email = "nadeeshtest" + System.currentTimeMillis() + "@gmail.com";
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(email);


        //7. Click 'Signup' button
        WebElement Signup_button = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
        Signup_button.click();
        Thread.sleep(2000);


        // Step 8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        boolean enterInfoVisible = driver.findElement(By.xpath("//b[text()='Enter Account Information']")).isDisplayed();
        if (enterInfoVisible) {
            System.out.println("✅ Step 5 - Enter Account Information is visible");
        } else {
            System.out.println("❌ Step 5 - Enter Account Information is not visible");
        }

        //9. Fill details: Title, Name, Email, Password, Date of birth
        driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345");
        driver.findElement(By.xpath("//select[@id='days']//option[@value='2']")).click();
        driver.findElement(By.xpath("//select[@id='months']//option[@value='5']")).click();
        driver.findElement(By.xpath("//select[@id='years']//option[@value='2001']")).click();

        //10. Select checkbox 'Sign up for our newsletter!'
        driver.findElement(By.xpath("//input[@name='newsletter']")).click();

        //11. Select checkbox 'Receive special offers from our partners!'
        driver.findElement(By.id("optin")).click();

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Nadeesh");
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Malaka");
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Sri Lanka");
        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("46/5,Kodurawa");
        driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Piliyandala");
        driver.findElement(By.xpath("//select[@id='country']//option[@value='Singapore']")).click();
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Western Province");
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Colombo");
        driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("123131");
        driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("0774857552");

        //13. Click 'Create Account button'
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button")).click();
        Thread.sleep(1000);


        //14. Verify that 'ACCOUNT CREATED!' is visible
        boolean crete_message = driver.findElement(By.xpath("//b[text()='Account Created!']")).isDisplayed();
        if(crete_message){
            System.out.println("✅ Step 6 - Account Created! is visible");
        }
        else {
            System.out.println("❌ Step 6 - Account Created! is Not visible");
        }

        //15. Click 'Continue' button
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();

        //16. Verify that 'Logged in as username' is visible
        String login_username = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/b")).getText();
        if(login_username.equals(username)){
            System.out.println("✅ Step 7 - The Logged in as username is visible ");
        }
        else {
            System.out.println("❌ Step 7 - The Logged in as username is not visible ");
        }

        //17. Click 'Delete Account' button
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();
        Thread.sleep(1000);

        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        boolean delete_message = driver.findElement(By.xpath("//b[text()='Account Deleted!']")).isDisplayed();
        if(delete_message){
            System.out.println("✅ Step 8 - Account Deleted! is visible");
        }
        else {
            System.out.println("❌ Step 8 - Account Deleted! is not visible");
        }


        System.out.println("\n===== ✅ Test Case 1: Completed Successfully =====\n");

    }
}
