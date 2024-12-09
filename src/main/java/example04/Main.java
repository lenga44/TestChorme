package example04;

import example04.pages.HomePage;
import example04.pages.LoginPage;
import example04.pages.OptionPage;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    private FirefoxDriver driver;

    @Test
    public void updateOrderOfAnOptionSuccess() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();

        loginSuccess();
        openOptionPageSuccess();
        editOptionSuccess();

        driver.quit();
    }
    public void loginSuccess() throws InterruptedException {
        String url = "http://113.164.228.218:8014/opencart/administrator";
        String username = "admin";
        String password = "admin";

        LoginPage loginPage = new LoginPage(driver);
        loginPage.openLoginPage(url);
        loginPage.enterUserName(username);
        loginPage.enterPassword(password);
        loginPage.clickSubmit();
    }
    public void openOptionPageSuccess() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.clickCatalogMenu();
        homePage.clickOptionItem();

        OptionPage optionPage = new OptionPage(driver);
        optionPage.verifyTitlePage();
    }

    public void editOptionSuccess() throws InterruptedException {
        OptionPage optionPage = new OptionPage(driver);
        optionPage.clickEditOptionButton();
        optionPage.enterOrderTextbox(6);
        optionPage.clickSaveButton();
        optionPage.verifyEditSuccessMess();
    }
}