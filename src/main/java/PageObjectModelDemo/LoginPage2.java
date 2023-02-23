package PageObjectModelDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//using page factory
public class LoginPage2 {

    //constructor
    WebDriver driver;
    LoginPage2(WebDriver d)
    {
        driver = d;

        //this method will create web elements
        PageFactory.initElements(driver, this);
    }

    //identify web element
    //identify user name
    @FindBy(id = "user-name")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement loginBtn;

    public void enterUsername(String uname)
    {
        username.sendKeys(uname);
    }

    public void enterPassword(String pass)
    {
        password.sendKeys(pass);
    }

    public void clickOnLoginBtn()
    {
        loginBtn.click();
    }
}
