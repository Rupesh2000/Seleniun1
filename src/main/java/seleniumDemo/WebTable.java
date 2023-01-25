package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTable {
    public static void main(String[]args) {

        //Launch Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\MyDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //for maximize the window browser
        driver.manage().window().maximize();

        //open url
        driver.get("C:\\Users\\rupes\\IdeaProjects\\JavaAutomation\\sampleTable.html");

        //find second cell in the web table and print second cell data
        String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();

        System.out.println(text);

        //find total rows in webtable
        List <WebElement> rowList = driver.findElements(By.xpath("//table/tbody/tr"));

        System.out.println("rows : "+ rowList.size());

        //find total column in webtable
        List <WebElement> columnList = driver.findElements(By.xpath("//table/tbody/tr[1]/th"));

        System.out.println("Columns : "+ columnList.size());

        for(int r=2; r<=rowList.size(); r++) //2,3
        {
            for(int c=1; c<=columnList.size(); c++) //1,2
            {
                String data = driver.findElement(By.xpath("//table/tbody/tr[" + r + "]/td[" + c +"]")).getText();

                System.out.println(data);
            }
        }
    }

}
