package com.testautomationdevelopment.RandomApp.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome_pageObjects {
    String base_url = "https://www.google.com";
    WebDriver chromeDriver = new ChromeDriver();
    
    public void navigateWebsite() {
        chromeDriver.get(base_url);
    }

    public void typeRandomWord(String word) {
        chromeDriver.manage().timeouts().getImplicitWaitTimeout();
        chromeDriver.findElement(By.className("gLFyf")).sendKeys(word);
    }

    public void clickButton() {
        chromeDriver.manage().timeouts().getImplicitWaitTimeout();
        chromeDriver.findElement(By.className("gNO89b")).click();
    }

    public void closeBrowser() {
        chromeDriver.close();
    }
}
