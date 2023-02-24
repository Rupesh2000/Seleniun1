package CrossBrowserTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CrossBrowserTestingDemo {

    WebDriver driver;

    @BeforeMethod
    public void LaunchBrowser()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void verifyTitle()
    {
        //open url
        driver.get("http://www.google.com");
        String expectedTitle = "Google";

        String actualTitle = driver.getTitle();

        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @AfterTest
    public void Quit()
    {
        driver.quit();
    }
}
