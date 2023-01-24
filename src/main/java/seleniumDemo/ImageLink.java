package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLink {
    public static void main(String[] args){

        //Launch Chrome browser
        System.setProperty("web-driver.chrome.driver","C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\MyDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //for maximize the window browser
        driver.manage().window().maximize();

        //open url
        driver.get("https://www.opencart.com/");

        //open image by xpath
        driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']")).click();

        //verify title of the current page with expected home
        if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution"))
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed");
        }

        //browser close
        driver.close();
    }
}
