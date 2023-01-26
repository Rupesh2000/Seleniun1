package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class VerticalScroll {

    public static void main(String[]args) throws IOException, InterruptedException {

        //Launch Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\MyDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //for maximize the window browser
        driver.manage().window().maximize();

        //open url
        //driver.get("https://www.calculator.net/");
        driver.get("http://www.album.alexflueras.ro/");

        JavascriptExecutor js = (JavascriptExecutor)driver;

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        //Scroll vertically down by 500 pixels
        //js.executeScript("window.scrollBy(x-pixels,y-pixels)");//by this method
        //js.executeScript("window.scrollBy(0,500)");

        //scroll till visibility of web element
        //WebElement element = driver.findElement(By.linkText("BMI Calculator"));
        //js.executeScript("arguments[0].scrollIntoView();",element );

        //Scroll down the web page at the bottom of the page
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        //Horizontal scroll on the web page
        WebElement Element1 = driver.findElement(By.id("a7"));
        js.executeScript("arguments[0].scrollIntoView();",Element1 );
    }
}
