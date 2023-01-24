package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BrokenLinks {
    public static void main(String[] args){

        //Launch Chrome browser
        System.setProperty("web-driver.chrome.driver","C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\MyDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //for maximize the window browser
        driver.manage().window().maximize();

        //Wait 10 seconds
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //open URL
        driver.get("http://www.deadlinkcity.com/");

        //finds hyperlinks
        List <WebElement> linksList = driver.findElements(By.tagName("a"));

        //capture url of all links
        int resCode = 200; //2xx response is valid link
        int brokenLinksCount = 0;

        System.out.println("Total links on page: " + linksList.size());

        for(WebElement element:linksList)
        {
            String url = element.getAttribute("herf");

            try{
                URL urlLinks = new URL(url);

                HttpURLConnection huc = (HttpURLConnection)urlLinks.openConnection();
                huc.setRequestMethod("HEAD");
                huc.connect();

                resCode = huc.getResponseCode();

                if(resCode >= 400)
                {
                    System.out.println(url + "broken link.");
                    brokenLinksCount ++;
                }

            }
            catch (MalformedURLException e)
            {

            }
            catch (Exception e)
            {

            }

        }
        System.out.println("Total broken links: " + brokenLinksCount);
    }
}
