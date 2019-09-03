import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test {
    protected static WebDriver driver;

    public static void main(String[] args)
    {
     System.setProperty("webdriver.chrome.driver","C:\\dev\\Automation\\src\\BrowserDriver\\chromedriver.exe");
     //open the browser
        driver= new ChromeDriver();
        //maximize the browser screen
        driver.manage().window().fullscreen();
        //set implicity wait for driver object
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //open website
        driver.get("https://demo.nopcommerce.com/");

        //click on register button
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        //enter first name
        driver.findElement(By.id("FirstName")).sendKeys("Venus");
        //enter last name
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Patel");
        //enter email
        driver.findElement(By.name("Email")).sendKeys("s1kathalana@gmail.com");
        //enter password
        driver.findElement(By.xpath("//input[@data-val-regex-pattern='^.{6,}$']")).sendKeys("mynameissunil");
        //enter confirm password field
        driver.findElement(By.xpath("//input[@data-val-equalto-other='*.Password']")).sendKeys("mynameissunil");
        //click on register
        driver.findElement(By.xpath("//input[@class='button-1 register-next-step-button']")).click();
        //close the browser window
        //driver.close();

    }
}
