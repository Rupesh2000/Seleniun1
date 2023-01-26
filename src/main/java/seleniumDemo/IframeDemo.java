package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class IframeDemo {
    public static void main(String[]args) throws IOException {

        //Launch Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\MyDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //for maximize the window browser
        driver.manage().window().maximize();

        //open url
        driver.get("https://www.rediff.com/");

        //switch to iframe moneyiframe
        driver.switchTo().frame("moneyiframe");

        //find web element
        String Nseindex = driver.findElement(By.id("nseindex")).getText();

        System.out.println(Nseindex);

    }
}
