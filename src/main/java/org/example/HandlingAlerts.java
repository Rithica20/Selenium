package org.example;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // 1. Javascript alert
//        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.accept();

//        By jsAlert = By.xpath("//button[text()='Click for JS Alert']");
//        handlingSimpleAlert(jsAlert);

        //2. JS Confirm alert
//        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.dismiss();
//        alert.accept();//NoAlertPresentException: no such alert

//        By jsConfirmAlert = By.xpath("//button[text()='Click for JS Confirm']");
//        handlingConfirmAlert(jsConfirmAlert);

        //3. JS Prompt alert
//        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
//        Alert alert = driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.sendKeys("rithica");
//        alert.accept();

        By jsPropmptAlert = By.xpath("//button[text()='Click for JS Prompt']");
        handlingPromptAlert(jsPropmptAlert,"rithica");

//
//        // to asssert the entered string
//        String result = driver.findElement(By.id("result")).getText();
//        if (result.contains("rithica")){
//            System.out.println("The given test case is pass");
//        }
//        else {
//            System.out.println("The given test case is fail");
//        }
//        String[] resultstr = result.split(":");
//        String finalstr = resultstr[1].trim();
//        //result.split(":")[1].trim();
//        if (finalstr.equals("rithica")){
//            System.out.println("The given test case is pass");
//        }
//        else {
//            System.out.println("The given test case is fail");
//        }
    }
     public static WebElement getElement(By locator){
            return driver.findElement(locator);
     }
     public static void handlingSimpleAlert(By locator){
         getElement(locator).click();
         Alert alert = driver.switchTo().alert();
         alert.accept();
     }
     public static void handlingConfirmAlert(By locator){
         getElement(locator).click();
         Alert alert = driver.switchTo().alert();
         alert.dismiss();
     }
     public static void handlingPromptAlert(By locator,String text){
         getElement(locator).click();
         Alert alert = driver.switchTo().alert();
         alert.sendKeys(text);
         alert.accept();
     }
}

