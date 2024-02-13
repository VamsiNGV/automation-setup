package ui_tests.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UIHelperMethods {

    static WebDriver driver;

    //Initialize Webdriver
    public WebDriver initializeWebDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkrish34\\Documents\\codebase\\java\\automation-setup\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        return driver;
    }

    //getDriver method
    public WebDriver getDriver() {
        if(driver != null)
            return driver;
        else
            return initializeWebDriver();

    }

    //quitDriver method
    public void quitDriver() {
        if(driver != null){
            driver.quit();
        }
    }

}
