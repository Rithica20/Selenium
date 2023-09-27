package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverWaitWithFluentWaitFeatures {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        By email = By.id("input-email");
        presenceof(email);

        // in webdriver wait also we can use all the methods of fluent wait as for fluent wait
        // is the parent class for webdriver wait
        // webdriver wait has onle three constructor of its own
        // whereas fluent wait uses its own method this is the major difference btwn these waits
    }
    public static void presenceof(By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .withMessage("waited still element not found")
                .until(ExpectedConditions.presenceOfElementLocated(locator));
    }

}
