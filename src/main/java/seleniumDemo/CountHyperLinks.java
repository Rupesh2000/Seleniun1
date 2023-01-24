package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CountHyperLinks {
    public static void main(String[] args){

        //Launch Chrome browser
        System.setProperty("web-driver.chrome.driver","C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\MyDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //for maximize the window
        driver.manage().window().maximize();

        //launch web page https://www.calculator.net/
        driver.get("https://www.calculator.net/");
        List <WebElement> linkElements = driver.findElements(By.tagName("a"));

        System.out.println("Total links on webpage:" + linkElements.size());

        for(WebElement el:linkElements)
        {
            System.out.println(el.getText());
        }
        driver.close();
    }
}
