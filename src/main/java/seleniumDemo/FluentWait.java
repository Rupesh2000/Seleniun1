package seleniumDemo;

import com.google.common.base.Stopwatch;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class FluentWait<W extends SearchContext> {
    public static void main(String[]args) throws IOException {

        //Launch Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\MyDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //for maximize the window brows er
        driver.manage().window().maximize();

        //open url
        driver.get("http://www.ebay.in/");

        //fluent wait of 10 seconds
        Wait <WebDriver> wait = new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .withMessage("This is custom message. ")
                .ignoring(NoSuchElementException.class);

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING")));
        element.click();

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

//        Stopwatch watch = null;
//
//        try {
//            watch = Stopwatch.createStarted();
//            //find webelement "START SELLING"
//            WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("wrong SELLING")));
//            element.click();
//
//            //driver.findElement(By.linkText("wrongelement")).click(); //through exception
//        }
//        catch(Exception e) {
//            watch.stop();
//            System.out.println(e);
//            System.out.println(watch.elapsed(TimeUnit.SECONDS) + " seconds");
//        }

    }
}
