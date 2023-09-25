package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsForAlerts {
    static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//        System.out.println(alert.getText());
//        alert.accept();

//        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//        waitForSimpleAlert(10);

//        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//        waitForConfirmAlert(10);

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        waitForPromptAlert(10,"rithica");
    }

    /**
     * This method will wait for simple alert and
     * it will get the text of the alert and
     * it will click ok button
     * @param timeout
     */
    public static void waitForSimpleAlert(int timeout){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alert.getText());
        alert.accept();;
    }
    /**
     * This method will wait for confirm alert and
     * it will get the text of the alert and
     * it will click cancel button
     * @param timeout
     */
    public static void waitForConfirmAlert(int timeout){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alert.getText());
        alert.dismiss();
    }
    /**
     * This method will wait for prompt alert and
     * it will get the text of the alert and
     * it will send text to the input field
     * then clicks on ok button
     * @param timeout
     */
    public static void waitForPromptAlert(int timeout,String text){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeout));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.sendKeys(text);
        System.out.println(alert.getText());
        alert.accept();
    }
}
