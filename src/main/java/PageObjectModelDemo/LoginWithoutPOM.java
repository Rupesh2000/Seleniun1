package PageObjectModelDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithoutPOM {

    public static void main(String[] args){

        //Launch Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Open url
        driver.get("https://www.saucedemo.com/");

        //Find & Enter username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //Find & enter Password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //perform login
        driver.findElement(By.id("login-button")).click();

    }
}
