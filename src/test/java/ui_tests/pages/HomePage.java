package ui_tests.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ui_tests.utilities.UIHelperMethods;

public class HomePage extends UIHelperMethods {
    WebDriver driver;

    HomePage(){
        this.driver = getDriver();
    }
    public void logout() {
        driver.findElement(By.linkText("Logout")).click();
    }

    public void validateHomePage(String expected, String driver) {
        //Validate if logged in
        Assert.assertEquals(expected, driver);
    }
}
