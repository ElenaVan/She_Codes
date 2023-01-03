package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTests {

    WebDriver wd;

    @BeforeMethod
    public void init(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wd.navigate().to("https://shecodesconnect.com/moodle/");

    }
    @Test
    public void loginSuccess(){
        // open login form
        WebElement loginItem = wd.findElement(By.cssSelector("span[class='login'] a"));
        loginItem.click();
        //fill username
        WebElement userName = wd.findElement(By.xpath("(//input[@id='username'])[1]"));
        userName.click();
        userName.clear();
        userName.sendKeys("elenavan");
        //fill password
        WebElement userPassword = wd.findElement(By.xpath("(//input[@id='password'])[1]"));
        userPassword.click();
        userPassword.clear();
        userPassword.sendKeys("Felia161075");
        //click login button
        wd.findElement(By.cssSelector("#loginbtn")).click();
        Assert.assertTrue(wd.findElements(By.cssSelector("#actionmenuaction-4")).size()>0);



    }




}
