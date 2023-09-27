package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PollingTimeInWaits {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        By email = By.id("input-email");

        // what if polling time is not given
        // driver will check infinite  times within the given wait time
        //polling time is the time we give for driver to check the element is loaded or not

        //10 secs, polling/interval time = 2 secs
        //0 sec --> e1 - NA
        //2 sec --> e1 - NA
        //4 sec --> e1 - NA
        //6 sec -- e1 -- NA

        //default polling time = 500 ms (0.5 sec)

        pollingTime(email,20,2).sendKeys("rithica");

    }
    public static WebElement pollingTime(By locator, int waitTime, int pollingTime){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime),Duration.ofSeconds(pollingTime));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
