package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class FileUploadAutoIT {

    public static void main(String[]args) throws IOException, InterruptedException {

        //Launch Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\MyDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //for maximize the window browser
        driver.manage().window().maximize();

        //open url
        driver.get("https://the-internet.herokuapp.com/upload");

        //find choose element web element
        //driver.findElement(By.id("file-upload")).click();

        WebElement button = driver.findElement(By.id("file-upload"));

        Actions act = new Actions(driver);
        act.moveToElement(button).click().perform();

        try{
            Runtime.getRuntime().exec("C://Users//rupes//OneDrive//Documents//FileUpload.exe" + " " + "C:\\Users\\rupes\\OneDrive\\Desktop\\jira.txt");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
