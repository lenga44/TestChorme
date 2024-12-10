package example04.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class OptionPage extends BasePage{

    public OptionPage(WebDriver driver) {
        super(driver);
    }

    public void verifyTitlePage(){
        WebElement title = getWebElement("//li[@class='breadcrumb-item']//a[contains(text(),'Options')]");
        Assertions.assertTrue(title.isDisplayed());
    }
    public void clickEditOptionButton() throws InterruptedException {
        WebElement addNewOption = getWebElement("//tbody/tr[10]/td[4]/a[1]");
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
        WebElement saveButton = getWebElement(By.cssSelector(".btn-primary"));
        actions.click(saveButton).perform();
    }
    public void verifyEditSuccessMess() throws InterruptedException {
        Thread.sleep(100);
        WebElement message = getWebElement("//div[@class='alert alert-success alert-dismissible']");
        Assertions.assertEquals("Success: You have modified options!",message.getText());
        Thread.sleep(200);
    }
}
