package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginClassWithSimplifiedCode {
    // using both browser util and element util classes to write code in simplified way

    static WebDriver driver;

    public static void main(String[] args) {

        BrowserUtil browserUtil = new BrowserUtil();
        driver = browserUtil.launchBroswer("chrome");
        browserUtil.launchUrl("https://www.facebook.com");

        ElementUtil elementUtil = new ElementUtil(driver);

        By email = By.id("email");
        By pswd = By.id("pass");

        elementUtil.doSendKeys(email,"abc@gmail.com");
        elementUtil.doSendKeys(pswd,"abc123");

        browserUtil.closeBrowser();

    }
}
