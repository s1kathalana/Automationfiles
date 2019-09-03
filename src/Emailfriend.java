

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

    public class Emailfriend
    {
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

            //click on login button
            driver.findElement(By.xpath("//a[@class='ico-login']")).click();
            //enter email
            driver.findElement(By.name("Email")).sendKeys("s1kathalana@gmail.com");
            //enter password
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mynameissunil");
            //enter login button
            driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
            //scroll to right


            //click on apple macbook pro 13 inch
            driver.findElement(By.xpath("//img[@alt='Picture of Apple MacBook Pro 13-inch']")).click();
            //click on email friend
            driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
            //fill up friend's email address details
            driver.findElement(By.xpath("//input[@class='friend-email']")).sendKeys("sunilkathalana@yahoo.co.in");
            //enter details in message
            driver.findElement(By.xpath("//textarea[@class='your-email']")).sendKeys("laptop information");
            //click on send button
            driver.findElement(By.xpath("//input[@class='button-1 send-email-a-friend-button']")).click();









            //close the browser window
            //driver.close();

        }
    }


