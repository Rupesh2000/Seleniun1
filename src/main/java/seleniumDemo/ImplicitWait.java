package seleniumDemo;

import com.google.common.base.Stopwatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ImplicitWait {
    public static void main(String[]args) throws IOException {

        //Launch Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\MyDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //for maximize the window browser
        driver.manage().window().maximize();

        //open url
        driver.get("http://www.ebay.in/");

        //wait for 10 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //find webelement "START SELLING"
        //driver.findElement(By.linkText("START SELLING")).click();

        Stopwatch watch = null;

        try {
            watch = Stopwatch.createStarted();
            //find webelement "START SELLING"
            driver.findElement(By.linkText("wrongelement")).click(); //through exception
        }
        catch(Exception e)
        {
            watch.stop();
            System.out.println(e);
            System.out.println(watch.elapsed(TimeUnit.SECONDS) + " seconds");
        }
    }
}
