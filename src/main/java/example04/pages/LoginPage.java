package example04.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    private String username;
    private String password;

    public LoginPage(WebDriver driver, String username, String password) {
        super(driver);
        this.username = username;
        this.password = password;
    }

    public void openLoginPage(String url) throws InterruptedException {
        driver.get(url);
        Thread.sleep(2000);
    }
    private void enterUserName(){
        WebElement usernameElement = getWebElement("//input[@name='username']");
        usernameElement.sendKeys(username);
    }
    private void enterPassword(){
        WebElement passwordElement = getWebElement("//input[@name='password']");
        passwordElement.sendKeys(password);
    }
    private void clickSubmit() throws InterruptedException {
        WebElement submit = getWebElement("//button[@type='submit']/i");
        submit.click();
        Thread.sleep(1000);
    }
    public void login() throws InterruptedException {
        enterUserName();
        enterPassword();
        clickSubmit();
    }
}
