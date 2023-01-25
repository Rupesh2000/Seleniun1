package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class Alerts {
    public static void main(String[] args) throws AWTException {

        //Launch Chrome browser
        System.setProperty("web-driver.chrome.driver", "C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\MyDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //for maximize the window browser
        driver.manage().window().maximize();

        //open url
        driver.get("http://uitestpractice.com/Students/Switchto");

        //find alert button and perform click action
        //driver.findElement(By.xpath("//button[@id='alert']")).click();

        //switch to alert window and accept the alert
        //driver.switchTo().alert().accept();//ok button to clicked

        //find confirm button and perform click action
        //driver.findElement(By.xpath("//button[@id='confirm']")).click();

        //switch to confirm window and accept the confirmation
        //driver.switchTo().alert().accept();//ok button to clicked
        //driver.switchTo().alert().dismiss();//to cancel alert

        //find prompt button and perform click action
        driver.findElement(By.xpath("//button[@id='prompt']")).click();

        //switch to alert window and entered name
        driver.switchTo().alert().sendKeys("Radha");

        //accept alert()
        driver.switchTo().alert().accept();//ok button to clicked
    }
}
