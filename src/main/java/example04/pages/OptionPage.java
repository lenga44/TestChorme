package example04.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OptionPage {
    private WebDriver driver;

    public OptionPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyTitlePage(){
        WebElement title = driver.findElement(By.xpath("//li[@class='breadcrumb-item']//a[contains(text(),'Options')]"));
        Assertions.assertTrue(title.isDisplayed());
    }
    public void clickEditOptionButton() throws InterruptedException {
        WebElement addNewOption = driver.findElement(By.xpath("//tbody/tr[10]/td[4]/a[1]"));
        addNewOption.click();
        Thread.sleep(200);
    }
    public void enterOrderTextbox(int optionName){
        WebElement option = getWebElement("//input[@id='input-sort-order']");
        option.clear();
        option.sendKeys(String.valueOf(optionName));
    }
    public void clickSaveButton(){
        Actions actions = new Actions(driver);
        WebElement saveButton = driver.findElement(By.cssSelector(".btn-primary"));
        actions.click(saveButton).perform();
    }
    public void verifyEditSuccessMess() throws InterruptedException {
        Thread.sleep(100);
        WebElement message = getWebElement("//div[@class='alert alert-success alert-dismissible']");
        Assertions.assertEquals("Success: You have modified options!",message.getText());
        Thread.sleep(200);
    }
    private WebElement getWebElement(String locator){
        return driver.findElement(By.xpath(locator));
    }
}
