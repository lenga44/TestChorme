package example04.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    private String catalogMenu = "//a[normalize-space()='Catalog']";
    private String optionItem = "//a[normalize-space()='Options']";
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public String getName(){
        WebElement currentUser = driver.findElement(By.cssSelector(".d-none.d-md-inline.d-lg-inline"));
        return currentUser.getText().trim();
    }
    public void clickCatalogMenu() throws InterruptedException {
        WebElement catalog= driver.findElement(By.xpath(catalogMenu));
        catalog.click();
        Thread.sleep(200);
    }
    public void clickOptionItem() throws InterruptedException {
        WebElement option = driver.findElement(By.xpath(optionItem));
        option.click();
        Thread.sleep(200);
    }
}
