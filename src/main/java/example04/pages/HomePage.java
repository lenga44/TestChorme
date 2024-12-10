package example04.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
    private String catalogMenu = "//a[normalize-space()='Catalog']";
    private String optionItem = "//a[normalize-space()='Options']";
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public String getName(){
        WebElement currentUser = getWebElement(By.cssSelector(".d-none.d-md-inline.d-lg-inline"));
        return currentUser.getText().trim();
    }
    public void clickOptionItem() throws InterruptedException {
        clickParentMenu(catalogMenu);
        clickSubMenu(optionItem);
    }
}
