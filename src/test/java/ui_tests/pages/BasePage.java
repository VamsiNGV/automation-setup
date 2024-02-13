package ui_tests.pages;

public class BasePage {
    public LoginPage loginPage;
    public HomePage homePage;

    //Make singleton objects for all the pages
    public LoginPage getLoginPage() {
       return loginPage == null ? new LoginPage() : loginPage;
    }

    public HomePage getHomePage() {
        return homePage == null ? new HomePage() : homePage;
    }
}
