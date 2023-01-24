package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

    public static void main(String[] args){
        // TODO Auto-generated method stub
//Launch chrome web browser
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\MyDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //launch google web page
        driver.navigate().to("http:\\www.facebook.com");

        //capture title of webpage and print

        String title = driver.getTitle();

        System.out.println("Page Title : " + title);

        //capture the url of the webpage

        System.out.println("URL : " + driver.getCurrentUrl());

        //capture page source
        System.out.println("page source : " + driver.getPageSource());
    }
}
