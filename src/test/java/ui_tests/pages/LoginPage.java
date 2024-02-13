package ui_tests.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ui_tests.utilities.UIHelperMethods;

public class LoginPage extends UIHelperMethods {
    WebDriver driver;
    public LoginPage(){
        this.driver = getDriver();
    }

    public void login(String userName, String password) {
        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.className("radius")).click();
    }

    public void validateLoginPage() {
        //Check whether system is logged out
        Assert.assertEquals(driver.findElement(By.xpath("//h2")).getText(),"Login Page");
    }
}
