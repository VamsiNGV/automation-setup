package ui_tests.e2e;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ui_tests.pages.HomePage;
import ui_tests.pages.LoginPage;

public class FirstTest {
    public static void main(String[] args) {
        //Launch chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nkrish34\\Documents\\codebase\\java\\automation-setup\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Launch URL https://the-internet.herokuapp.com/login
        driver.get("https://the-internet.herokuapp.com/login");

        //Login using Username and Password and click Login
        LoginPage loginPage = new LoginPage();
        loginPage.login("tomsmith", "SuperSecretPassword!");

//        HomePage.validateHomePage("Welcome to the Secure Area. When you are done click logout below.", driver.findElement(By.className("subheader")).getText());
//
//        //Logout
//        HomePage.logout();

        loginPage.validateLoginPage();

        //Quit driver
        driver.quit();

    }

}
