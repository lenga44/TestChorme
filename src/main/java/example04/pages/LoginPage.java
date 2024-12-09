package example04.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void openLoginPage(String url) throws InterruptedException {
        driver.get(url);
        Thread.sleep(2000);
    }
    public void enterUserName(String username){
        WebElement usernameElement = driver.findElement(By.xpath("//input[@name='username']"));
        usernameElement.sendKeys(username);
    }
    public void enterPassword(String password){
        WebElement passwordElement = driver.findElement(By.xpath("//input[@name='password']"));
        passwordElement.sendKeys(password);
    }
    public void clickSubmit() throws InterruptedException {
        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']/i"));
        submit.click();
        Thread.sleep(1000);
    }
}
