package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class FluentWaits {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        By email = By.id("input-email");

        visibilityOfElementLocatedWithFluentWait(1,20,email).sendKeys("rithica");
        presenceOfElementLocatedWithFluentWait(1,20,email).sendKeys("sudhakar");
    }
    public static WebElement presenceOfElementLocatedWithFluentWait(int pollingTime, int waitTime, By locator){
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(waitTime))
                .pollingEvery(Duration.ofSeconds(pollingTime))
                .ignoring(NoSuchElementException.class)
                .withMessage("waited till "+waitTime+" seconds element not found"+locator);
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
//    public static Object visibilityOfElementLocatedWithFluentWait(int pollingTime, int waitTime, By locator){
//        Wait wait = new FluentWait(driver)
//                .withTimeout(Duration.ofSeconds(waitTime))
//                .pollingEvery(Duration.ofSeconds(pollingTime))
//                .ignoring(NoSuchElementException.class)
//                .withMessage("");
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//    }

    public static WebElement visibilityOfElementLocatedWithFluentWait(int pollingTime, int waitTime, By locator){
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(waitTime))
                .pollingEvery(Duration.ofSeconds(pollingTime))
                .ignoring(NoSuchElementException.class)
                .withMessage("waited till "+waitTime+" seconds element not found\"+locator");
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static void waitalertIsPresentWithFluentWait(int pollingTime, int waitTime){
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(waitTime))
                .pollingEvery(Duration.ofSeconds(pollingTime))
                .ignoring(NoAlertPresentException.class)
                .withMessage("waited till "+waitTime+" seconds element not found");
         wait.until(ExpectedConditions.alertIsPresent());
    }
}
