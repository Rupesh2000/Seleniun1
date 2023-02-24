package CookiesDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class CookiesExample {

    public static void main(String[] args){

        //Launch Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //open URL
        driver.get("https://www.amazon.in/");

        //capture all the cookies
        Set<Cookie> cookiesList = driver.manage().getCookies();

        //print size/number of cookies
        System.out.println("Size Before add Cookie : " + cookiesList.size());

        for(Cookie ck:cookiesList)
        {
            System.out.println(ck.getName() + ":" + ck.getValue());
        }

        //get specific cookie according to name
        //System.out.println(driver.manage().getCookieNamed("i18n-prefs"));

        //Create cookies
        Cookie cookieObj = new Cookie("TestCookie", "www.amazon.in");

        //add cookie to browser
        driver.manage().addCookie(cookieObj);

        //capture all the cookies
        cookiesList = driver.manage().getCookies();

        //print size/number of cookies
        System.out.println("\nSize After add Cookie : " + cookiesList.size());

        for(Cookie ck:cookiesList)
        {
            System.out.println(ck.getName() + ":" + ck.getValue());
        }

        //delete cookie
        //driver.manage().deleteCookie(cookieObj);
        //driver.manage().deleteCookieNamed("TestCookie");
        driver.manage().deleteAllCookies();

        //capture all the cookies
        cookiesList = driver.manage().getCookies();

        //print size/number of cookies
        System.out.println("\nSize After delete Cookie : " + cookiesList.size());

        for(Cookie ck:cookiesList)
        {
            System.out.println(ck.getName() + ":" + ck.getValue());
        }



        driver.quit();
    }
}
