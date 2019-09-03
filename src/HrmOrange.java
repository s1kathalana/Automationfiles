import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HrmOrange {
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
        driver.get("https://opensource-demo.orangehrmlive.com/");

        //click on username
        driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
        //enter password
        driver.findElement(By.xpath("//*[@autocomplete='off']")).sendKeys("admin123");
        //click on login
        driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
        //click on dropdown
        driver.findElement(By.xpath("//*[@id='welcome']")).click();
        //click on logout
        driver.findElement(By.xpath("//a[contains(@href,'logout')]")).click();
        //driver.close();

    }
}

