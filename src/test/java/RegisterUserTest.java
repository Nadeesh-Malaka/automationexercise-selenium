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

        //5. Verify 'New User Signup!' is visible
        String signup_message = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/h2")).getText();
        if(signup_message.equals("New User Signup!")){
            System.out.println(signup_message + "is visible");
        }
        else {
            System.out.println("New User Signup! is not visible");
        }
        Thread.sleep(2000);

        //6. Enter name and email address
        String username = "Nadeesh1212";
        String email = "nadeeshtest" + System.currentTimeMillis() + "@gmail.com";


        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(email);
        Thread.sleep(2000);

        //7. Click 'Signup' button
        WebElement Signup_button = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
        Signup_button.click();
        Thread.sleep(2000);

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        String Enter_details_message = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/h2/b")).getText();
        if(Enter_details_message.equals("Enter Account Information")){
            System.out.println(Enter_details_message + "is visible");
        }
        else {
            System.out.println("Enter Account Information! is not visible");
        }
        Thread.sleep(2000);

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
        Thread.sleep(2000);

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
        Thread.sleep(2000);

        //13. Click 'Create Account button'
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button")).click();


        //14. Verify that 'ACCOUNT CREATED!' is visible
        String crete_message = driver.findElement(By.xpath("//section//div//div//div//h2//b")).getText();
        if(crete_message.equals("Account Created!")){
            System.out.println(crete_message + "is visible");
        }
        else {
            System.out.println("Account Created! is not visible");
        }
        Thread.sleep(2000);

        //15. Click 'Continue' button
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a")).click();

        //16. Verify that 'Logged in as username' is visible
        String login_username = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/b")).getText();
        if(login_username.equals(username)){
            System.out.println("The Logged in as username is visible ");
        }
        else {
            System.out.println("The Logged in as username is not visible ");
        }
        Thread.sleep(2000);

        //17. Click 'Delete Account' button
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")).click();

        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        String delete_message = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b")).getText();
        if(delete_message.equals("Account Deleted!")){
            System.out.println(delete_message + " is visible");
        }
        else {
            System.out.println("Account Deleted! is not visible");
        }
        Thread.sleep(2000);




    }
}
