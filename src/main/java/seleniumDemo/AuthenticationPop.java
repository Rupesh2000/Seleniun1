package seleniumDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthenticationPop {
    public static void main(String[] args) {

        //Launch Chrome browser
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();

        //Launch firefox browser
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        //for maximize the window browser
        driver.manage().window().maximize();

        //open URL
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
}
