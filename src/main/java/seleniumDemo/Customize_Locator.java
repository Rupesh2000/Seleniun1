package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customize_Locator {
    public static void main(String[] args){

        //Launch Chrome browser
        System.setProperty("web-driver.chrome.driver","C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\MyDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //open swag lab web page
        driver.get("http://www.saucedemo.com");

        //locate user name -- tag#id
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");

        //locate password - tag[attribute=value]
        driver.findElement(By.cssSelector("input[name=password]")).sendKeys("secret_sauce");

        //locate login button using tag.value of class name
        driver.findElement(By.cssSelector("input.submit-button")).click();

        //switch to product page
        String currentWindowHandle = driver.getWindowHandle();
        driver.switchTo().window(currentWindowHandle);

        //tag.valueClass[attribute=value]
        driver.findElement(By.cssSelector("button.btn[name=add-to-cart-sauce-labs-backpack]")).click();

        //tag[attribute$=substring]
        driver.findElement(By.cssSelector("button[name$=light")).click();//for end substring

        //tag[attribute^=substring]
        driver.findElement(By.cssSelector("button[name^=add-to-cart-test")).click(); //for starting substring

        //tag[attribute*=substring]
        driver.findElement(By.cssSelector("button[name*=fleece")).click();// for contain substring
    }
}
