package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WebDriverWaitClass {
    static WebDriver driver;
    public static void main(String[] args) {

        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        By login = By.id("email");
        By pswd = By.id("pass");

//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.presenceOfElementLocated(login));

//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(pswd));

        presenceofElementLocated(20,login).sendKeys("rithica");
        visibilityofElementLocated(20,pswd).sendKeys("sudhakar");


    }

    /**
     * this method will check wheather the element is present of dom and
     * it will not check wheather it is visible on the webopage
     * @param time
     * @param locator
     * @return
     */
    public static WebElement presenceofElementLocated(int time, By locator){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    /**
     * this method will check wheather the element is visible on the web page
     * @param time
     * @param locator
     * @return
     */

    public static WebElement visibilityofElementLocated(int time,By locator){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}
