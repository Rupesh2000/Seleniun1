package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTable2 {
    public static void main(String[]args) {

        //Launch Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\MyDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //for maximize the window browser
        driver.manage().window().maximize();

        //open url
        driver.get("https://testautomationpractice.blogspot.com/");

        //find total rows in webtable
        List<WebElement> rowList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));

        System.out.println("rows : "+ rowList.size());

        //find total column in webtable
        List <WebElement> columnList = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));

        System.out.println("Columns : "+ columnList.size());

        for(int r=2; r<=rowList.size(); r++) //for row : 2,3,4,5,6,7
        {
            for(int c=1; c<=columnList.size(); c++) //for column : 1,2,3,4
            {
                String data = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[" + r + "]/td[" + c +"]")).getText();

                System.out.print(" "+  data);
            }
            System.out.println(" ");
        }


    }
}
