package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class JavaScriptsExec {
    public static void main(String[]args) throws IOException {

        //Launch Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rupes\\OneDrive\\Desktop\\TestAuto\\MyDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //for maximize the window browser
        driver.manage().window().maximize();

        //open url
        driver.get("http://uitestpractice.com/Students/Index");

        JavascriptExecutor js = (JavascriptExecutor)driver;

        //To Type text in seach box
        //js.executeScript("document.getElementById('Search_Data').value='Aron Macapagal';");

        //To click on find button
        WebElement element = driver.findElement(By.xpath("//input[@value='Find']"));

        JavaScriptUtility.drawBorder(element, driver);
        System.out.println(JavaScriptUtility.getTitleByJavaScript(driver));


        //js.executeScript("arguments[0].click();",element);

        //refresh the browser window
        //js.executeScript("history.go(0)");

        //get domain name
        //String domain = js.executeScript("return document.domain;").toString();
        //System.out.println("Domain : " + domain);

        //get the title of our webpage
        //String title = js.executeScript("return document.title;").toString();
        //System.out.println("Title : " + title);

        //get url name
        //String url = js.executeScript("return document.URL;").toString();
        //System.out.println("URL : " + url);

        //Draw border around web element
        //js.executeScript("arguments[0].style.border = '3px solid red';", element);

        //To zoom page 50%
        //js.executeScript("document.body.style.zoom='50%'");

        //Return height and width of web page
        //System.out.println(js.executeScript("return window.innerHeight;").toString());
        //System.out.println(js.executeScript("return window.innerWidth;").toString());

        //scroll verification till the end
        //js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        //scroll verification till the end
        //js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

        //To generate Alert Pop window
        //js.executeScript("alert('This is my alert message.');");

        //To navigate to different page using Javascript
        //js.executeScript("window.location = 'http://www.google.com'");

        //To flash web element
        String bgcolor = element.getCssValue("backgroundColor");
        for(int i=0; i<50; i++)
        {
            js.executeScript("arguments[0].style.backgroundColor = '#000000'", element);//black

            try{
                Thread.sleep(20);//20 ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            js.executeScript("arguments[0].style.backgroundColor = '" + bgcolor + "'", element);

            try{
                Thread.sleep(20);//20 ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
