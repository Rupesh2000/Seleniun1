package PageObjectModelDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args)
    {
        //Launch Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Create object of login page
        LoginPage LoginPg = new LoginPage(driver);

        //Open url
        driver.get("https://www.saucedemo.com/");

        LoginPg.enterUsername("standard_user");
        LoginPg.enterPassword("secret_sauce");
        LoginPg.clickOnLoginBtn();
    }
}
