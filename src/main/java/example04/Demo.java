package example04;

import example04.pages.HomePage;
import example04.pages.LoginPage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://113.164.228.218:8014/opencart/administrator/";
        ChromeDriver driver = new ChromeDriver();

        LoginPage loginPage = new LoginPage(driver,"admin","admin");
        loginPage.openLoginPage(url);
        loginPage.login();

        HomePage homePage = new HomePage(driver);
        String name = homePage.getName();
        Assertions.assertEquals("Quang NGUYEN DANG", name);

        driver.quit();
    }
}
