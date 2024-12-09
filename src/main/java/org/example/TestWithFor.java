package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWithFor {
    @Test
    public void testcase01() throws InterruptedException {
        String url = "http://113.164.228.218:8014/opencart/administrator";
        String username = "admin";
        String password = "admin";

        WebDriver driver = new ChromeDriver();
        driver.get(url);

        for (int i=0;i<5;i++) {
            driver.findElement(By.id("input-username")).sendKeys(username+i);
            driver.findElement(By.id("input-password")).sendKeys(password+i);
            driver.findElement(By.cssSelector(".btn.btn-primary")).click();
            Thread.sleep(1000);

            driver.findElement(By.id("input-username")).clear();
            driver.findElement(By.id("input-password")).clear();
        }
    }
}
