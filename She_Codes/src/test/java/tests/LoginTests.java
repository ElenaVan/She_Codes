package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{



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
    @Test
    public void LoginSuccessNew(){
        click(By.cssSelector("span[class='login'] a"));
        type(By.xpath("(//input[@id='username'])[1]"),"elenavan");
        type(By.xpath("(//input[@id='password'])[1]"),"Felia161075");
        click(By.cssSelector("#loginbtn"));
        Assert.assertTrue(isElementPresent(By.cssSelector("#actionmenuaction-4")));
    }




}
