package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Year;
import java.util.List;

public class DatePickerDemo2 {


    public static void main(String[]args) throws IOException, InterruptedException {


        //28-January-2023;

        String expectedDay = "28";
        String expectedMonthYear = "Jan 2023";

        //Launch Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\MyDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //for maximize the window browser
        driver.manage().window().maximize();

        //open url
        driver.get("https://www.redbus.in/");

        //find date picker web element to perform click action
        WebElement datepicker = driver.findElement(By.id("onward_cal"));
        datepicker.click();

        while(true)
        {
            String calenderMonthYear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();

            if(calenderMonthYear.equals(expectedMonthYear))
            {
                driver.findElement(By.xpath("//td[text()='" + expectedDay+ "']")).click();

                break;
            }
            else
            {
                driver.findElement(By.xpath("//td[@class='next']")).click();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }

    }
}
