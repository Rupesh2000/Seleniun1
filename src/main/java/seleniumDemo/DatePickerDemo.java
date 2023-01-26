package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class DatePickerDemo {

    public static void main(String[]args) throws IOException, InterruptedException {


        //02-May-2022

        String expectedDay = "22";
        String expectedMonth = "March";
        String expectedYear = "2026";

        //Launch Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\MyDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //for maximize the window browser
        driver.manage().window().maximize();

        //open url
        driver.get("https://jqueryui.com/datepicker/");

        //Switch to iframe
        driver.switchTo().frame(0);

        //find date picker web element to perform click action
        WebElement datepicker = driver.findElement(By.id("datepicker"));
        datepicker.click();

        while(true)
        {
            String calenderMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month'] ")).getText();
            String calenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if(calenderMonth.equals(expectedMonth) && calenderYear.equals(expectedYear))
            {
                List <WebElement> daysList = driver.findElements(By.xpath("//table/tbody/tr/td"));

                for(WebElement e:daysList)
                {
                    String calenderDay = e.getText();
                    if(calenderDay.equals(expectedDay))
                    {
                        e.click();
                        break;
                    }
                }
                break;
            }
            else
            {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            }
        }

    }
}
