package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DatePickerDemo3 {

    public static void main(String[] args) {

        //28-Mar-2023;

        String expectedDay = "28";
        String expectedMonthYear = "March 2023";
        //String expectedYear = "2022";

        //Launch Chrome browser
        System.setProperty("web-driver.chrome.driver", "C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\MyDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //for maximize the window browser
        driver.manage().window().maximize();

        //open url
        driver.get("https://www.goibibo.com/");

        //find date picker webelement to perform click action

        WebElement datepicker = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]"));
        datepicker.click();

        while(true)
        {
            String calenderMonthYear = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/div")).getText();

            if(calenderMonthYear.equals(expectedMonthYear))
            {
                List<WebElement> daysList = driver.findElements(By.xpath("//p[@class='fsw__date']"));

                for(WebElement e:daysList)
                {
                    String calenderDay = e.getText();
                    if(calenderDay.equals(expectedDay))
                    {
                        e.click();
                        driver.findElement(By.xpath("//span[@class='fswTrvl__done']")).click();
                        break;

                    }
                }

                break;
            }
            else
            {
                driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
            }
        }

    }
}
