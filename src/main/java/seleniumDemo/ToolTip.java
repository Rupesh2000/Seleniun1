package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {
    public static void main(String[]args) {

        //Launch Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\MyDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //for maximize the window browser
        driver.manage().window().maximize();

        //open url
        driver.get("https://testautomationpractice.blogspot.com/");

        //find web element age input box
        String ActualTooltip = driver.findElement(By.xpath("//input[@id='age']")).getAttribute("title");

        String ExpectedTooltip = "We ask for your age only for statistical purposes.";

        if(ActualTooltip.equals(ExpectedTooltip))
        {
            System.out.println("test passed");
        }
        else
        {
            System.out.println("test failed");
        }
    }
}
