package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
public class NestediframeDemo {
    public static void main(String[]args) throws IOException {

        //Launch Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\MyDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //for maximize the window browser
        driver.manage().window().maximize();

        //open url
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

        //switch to target frame
        driver.switchTo().frame("frame1"); // parent frame/outer frame
        driver.switchTo().frame("frame3"); // child frame/inner frame

        //find webelement checkbox
        driver.findElement(By.id("a")).click();

        //switch to parent frame
        driver.switchTo().parentFrame();

        //find webelenment input box
        driver.findElement(By.tagName("input")).sendKeys("this is text message");

        //switch to main page
        driver.switchTo().defaultContent();

        //switch to frame 2nd
        driver.switchTo().frame("frame2");

        //find webelement animal dropdown
        WebElement dropdownElement = driver.findElement(By.id("animals"));
        Select dropDown = new Select(dropdownElement);

        dropDown.selectByVisibleText("Avatar");
    }
}
