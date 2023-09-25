package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsForFrames {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("http://www.londonfreelance.org/courses/frames/index.html\"");

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("main"));
//        String text = driver.findElement(By.tagName("h2")).getText();
//        System.out.println(text);

        By frame = By.xpath("//frame[@name='main']");

//        frameAndSwitchToItWithNameorId(20,"main");
        frameAndSwitchToItWithWebElement(20,frame);
//        frameAndSwitchToItWithIndex(20,2);
        String text = driver.findElement(By.tagName("h2")).getText();
        System.out.println(text);

    }

    /**
     * this method will switch to frame using name or id
     * @param timeinsec
     * @param text
     */
    public static void frameAndSwitchToItWithNameorId(int timeinsec, String text){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeinsec));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(text));
    }

    /**
     * this method will switch to frame using frame index
     * @param timeinsec
     * @param index
     */
    public static void frameAndSwitchToItWithIndex(int timeinsec, int index){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeinsec));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
    }

    /**
     * this method will switch to frame using by locator
     * @param timeinsec
     * @param locator
     */
    public static void frameAndSwitchToItWithWebElement(int timeinsec, By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeinsec));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(locator)));
    }
    /**
     * this method will check whether we can peform actions on web page
     * @param timeinsec
     * @param locator
     */
    public void elementToBeClickable(int timeinsec, By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeinsec));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(locator)));
    }

}
