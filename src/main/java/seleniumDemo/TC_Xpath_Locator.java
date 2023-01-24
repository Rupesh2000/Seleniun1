package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class TC_Xpath_Locator {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\MyDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //Open sauce demo web page
        driver.get("https://www.saucedemo.com/");

        //locate username by id
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //locate username by tag-name
        //driver.findElement(By.tagName("input")).sendKeys("standard_user");

        //locate password by name
        driver.findElement(By.name("password")).sendKeys("secret_sauce");

        //locate password by tagName
        //driver.findElement(By.tagName("input")).sendKeys("secret_sauce"); // it will throw error bcz tag name is not uniquely identify

        //locate login button by class name
        driver.findElement(By.className("submit-button")).click();

        //switch to product page
        String currentWindowHandle = driver.getWindowHandle();
        driver.switchTo().window(currentWindowHandle);

        //locate Sauce Labs Bolt T-Shirt
        //driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();//click operation

        //locate Sauce Labs Bolt T-Shirt by partial-text
        //driver.findElement(By.partialLinkText("T-Shirt")).click();//click operation

        //locate Sauce Labs Bolt T-Shirt by partial-text
        List <WebElement> elementList = (List<WebElement>) driver.findElements(By.partialLinkText("Sauce"));
        System.out.println("Element Size : "+ elementList.size());
    }
}
