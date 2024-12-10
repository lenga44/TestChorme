package example04.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    protected void clickParentMenu(String name) throws InterruptedException {
        WebElement catalog= getWebElement(name);
        catalog.click();
        Thread.sleep(200);
    }
    protected void clickSubMenu(String name) throws InterruptedException {
        WebElement option = getWebElement(name);
        option.click();
        Thread.sleep(200);
    }
    protected WebElement getWebElement(String locator){
        return driver.findElement(By.xpath(locator));
    }
    protected WebElement getWebElement(By by){
        return driver.findElement(by);
    }
}
