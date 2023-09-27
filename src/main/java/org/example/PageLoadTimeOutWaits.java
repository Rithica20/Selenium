package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageLoadTimeOutWaits {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        By email = By.id("input-email");

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        jsReturnsValue(10);
    }

    // complete , interactive, loading these states are available
    public static void jsReturnsValue(int time){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
        String value = wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == 'complete'")).toString();
        if (Boolean.parseBoolean(value)){
            System.out.println("page has been loaded successfully");
        }
    }
}
