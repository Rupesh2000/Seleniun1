package EncodePasswordDemo;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.buffer.ByteBuf;
//import io.netty.handler.codec.base64.Base64;
import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EncodePasswordExample {

    public static void main(String[] args) {

        //encode password
//        String password = "secret_sauce";
//
//        byte[] encodedPassword = Base64.encodeBase64(password.getBytes());
//
//        System.out.println(new String(encodedPassword));

        //Launch Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //Open URL
        driver.get("https://www.saucedemo.com/");

        //enter UserName
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //decode password
        byte[] decodePassword = Base64.decodeBase64("c2VjcmV0X3NhdWNl");

        //Enter Password
        driver.findElement(By.id("password")).sendKeys(new String(decodePassword));

        //click on login button
        driver.findElement(By.id("login-button")).click();
    }
}
