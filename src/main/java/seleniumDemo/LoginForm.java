package seleniumDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LoginForm {

    public static void main(String[] args) {

        //Launch Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Open URL
        driver.get("https://www.saucedemo.com/");

//        //Enter Username
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//
//        //Enter Password
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//
//        //Perform Login Button
//        driver.findElement(By.id("login-button")).click();

        Actions actions = new Actions(driver);
        Action seriesOfAction = actions
                .moveToElement(driver.findElement(By.id("user-name")))
                .click()
                .sendKeys("standard_user", Keys.TAB)
                .sendKeys("secret_sauce",Keys.ENTER).build();
        seriesOfAction.perform();
    }
}
