package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class IframeDemo2 {
    public static void main(String[]args) throws IOException {

        //Launch Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\MyDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //for maximize the window browser
        driver.manage().window().maximize();

        //open url
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

        //switch to 1st frame
        WebElement iframeElement = driver.findElement(By.name("packageListFrame"));
        driver.switchTo().frame(iframeElement);

        //find web element
        driver.findElement(By.linkText("org.openqa.selenium")).click();

        //switch to main page
        driver.switchTo().defaultContent();

        //switch to 2nd frame
        driver.switchTo().frame(1);

        //find web element "Alert" link text of 2nd frame
        driver.findElement(By.linkText("Alert")).click();

        //switch to main page
        driver.switchTo().defaultContent();

        //find and print total iframes on web page
        int noOfiframes = driver.findElements(By.tagName("iframe")).size();
        System.out.println("no. of iframes : "+ noOfiframes);
    }
}
