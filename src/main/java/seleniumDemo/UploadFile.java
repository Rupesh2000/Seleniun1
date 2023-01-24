package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UploadFile {
    public static void main(String[] args) throws AWTException {

        //Launch Chrome browser
        System.setProperty("web-driver.chrome.driver", "C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\MyDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //for maximize the window browser
        driver.manage().window().maximize();

        //open url
        driver.get("https://demoqa.com/upload-download");

        //find webelement choose file
        //driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\rupes\\OneDrive\\Desktop\\Jira.txt");

        WebElement button = driver.findElement(By.xpath("//input[@id='uploadFile']"));

        Actions act = new Actions(driver);
        act.moveToElement(button).click().perform();

        Robot rb = new Robot();
        rb.delay(2000);

        //copy file to clip board
        StringSelection ss = new StringSelection("C:\\Users\\rupes\\OneDrive\\Desktop\\Jira.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        //perform control + v action to paste file
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

    }
}
