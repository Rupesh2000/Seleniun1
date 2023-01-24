package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CountRadioButtons {

    public static void main(String[] args){

        //Launch Chrome browser
        System.setProperty("web-driver.chrome.driver","C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\MyDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //for maximize the window browser
        driver.manage().window().maximize();

        //open url https://udyamregistration.gov.in/Udyam_Login.aspx
        //driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
        driver.get("https://www.calculator.net/");

        //Find radio button on web elements on web page
        List <WebElement> radioButtonsList = driver.findElements(By.xpath("//input[@type='radio']"));

        //Print total no. of radio buttons in radiobutton-list
        System.out.println("Total no of radio buttons on web page : " +radioButtonsList.size());

        //Close browser
        driver.close();

    }
}
