package org.example;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    String url = "http://113.164.228.218:8014/opencart/administrator";
    String username = "admin";
    String password = "admin";
    WebDriver driver;
    @Test
    public void testCase01() {
        int a =2;
        if(a==0){
            driver = new ChromeDriver();
        }else {
            driver = new FirefoxDriver();
        }
        if(url.contains("8015")){
            username="8014";
        }else {
            username = "Invalid site";
        }
        driver.get(url);
        driver.findElement(By.id("input-username")).sendKeys(username);
        driver.findElement(By.id("input-password")).sendKeys(password);
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
    }

    public void testCase02(){
        int a=7;
        int b=5;
        Assert.assertEquals(a+b,12);
    }
    public void testCase03(){
        int a=7;
        int b=5;
        int c = a - ++b;
        //TH1: 1 Dang
        //THanh: 2

        Assert.assertEquals(1,c);
    }
}