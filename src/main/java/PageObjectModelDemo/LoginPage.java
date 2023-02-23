package PageObjectModelDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Without page factory
public class LoginPage {

    WebDriver driver;

    LoginPage(WebDriver d)
    {
        driver = d;
    }

    By username = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");

    public void enterUsername(String uname)
    {
        driver.findElement(username).sendKeys(uname);
    }

    public void enterPassword(String pass)
    {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickOnLoginBtn()
    {
        driver.findElement(loginBtn).click();
    }
}
