package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class faceBookToolTip {
    public static void main(String[]args) {

        //Launch Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\MyDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //for maximize the window browser
        driver.manage().window().maximize();

        //open url
        driver.get("https://www.facebook.com/");

        //find sign up web element
        String actualTooltip = driver.findElement(By.xpath("//a[@href='/reg/']")).getAttribute("title");

       String expectedTooltip = "Sign up for Facebook";

       if(actualTooltip.equals(expectedTooltip))
       {
           System.out.println("test Passed");
       }
       else
       {
           System.out.println("test Failed");
       }
    }
}
