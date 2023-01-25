package seleniumDemo;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class CaptureScreenShot {
    public static void main(String[]args) throws IOException {

        //Launch Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\MyDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //for maximize the window browser
        driver.manage().window().maximize();

        //open url
        driver.get("http://uitestpractice.com/");

//        //capture full page screenshot
//        //step1 : Convert webdriver object to take screenshot interface
//        TakesScreenshot screenshot = ((TakesScreenshot)driver);
//
//        //step 2 : call getScreenshotAs method to create image file
//
//        File src = screenshot.getScreenshotAs(OutputType.FILE);
//
//        File dest = new File("C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\Screenshots\\fullsPage.png");
//
//        //step3: copy image file to destination
//        FileUtils.copyFile(src, dest);

        //capture section of a web page
        //step1 : Convert webdriver object to take screenshot interface
        //TakesScreenshot screenshot = ((TakesScreenshot)driver);

        WebElement section = driver.findElement(By.xpath("//button[@name='dblClick']"));


        //step 2 : call getScreenshotAs method to create image file

        File src = section.getScreenshotAs(OutputType.FILE);

        File dest = new File("C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\Screenshots\\doubleClick.png");

        //step3: copy image file to destination
        FileUtils.copyFile(src, dest);
    }
}
