package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDown {
    public static void main(String[] args){

        //Launch Chrome browser
        System.setProperty("web-driver.chrome.driver","C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\MyDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Open https://www.opencart.com/index.php?route=account/register
        driver.get("https://www.opencart.com/index.php?route=account/register");

        WebElement element = driver.findElement(By.id("input-country"));

        Select dropdown = new Select(element);

        //dropdown.selectByVisible("Hong Kong);

        //dropdown.selectByValue("98");

        dropdown.selectByIndex(5);

        if(dropdown.isMultiple())
        {
            System.out.println("Drop down is multiple");
        }
        else
        {
            System.out.println("Dropdown is not multiple");
        }


        List <WebElement> alldropdownoptions = dropdown.getOptions();

        System.out.println("Total options:" + alldropdownoptions.size());

        //print all dropdowns text
        for(WebElement el : alldropdownoptions)
        {
            System.out.println(el.getText());
        }

        driver.close();
    }
}
