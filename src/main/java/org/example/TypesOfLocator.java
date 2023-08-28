package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypesOfLocator {

    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        // Type 1: not advisible as we need cannot pass different type of input with same reference
//        driver.findElement(By.id("email")).sendKeys("rithica@gmail.com");
//        driver.findElement(By.id("pass")).sendKeys("rithica@123");

        //Type 2: not advisible but here we can pass multiple input with same reference name
//        WebElement email = driver.findElement(By.id("email"));
//        WebElement pswd = driver.findElement(By.id("pass"));
//
//        email.sendKeys("abc@gmail.com");
//        pswd.sendKeys("1234");
//
//        email.sendKeys("abc123@gmail.com");
//        pswd.sendKeys("abc213");

        // Type 3: Using By class to reduce calling api's several times

//        By email = By.id("email");
//        By pswd = By.id("pass");
//
//        WebElement ename = driver.findElement(email);
//        WebElement pswdvalue = driver.findElement(pswd);
//
//        ename.sendKeys("abce@gmail.com");
//        pswdvalue.sendKeys("12345");

        // Type 4: writing more effictive way of type 3
//
//        By email = By.id("email");
//        By pswd = By.id("pass");
//
//        getElement(email).sendKeys("abc@123");
//        getElement(pswd).sendKeys("12345");
        // Type 5: writting more effictive way of type 4 (Using utility methods)
//
//        By email = By.id("email");
//        By pswd = By.id("pass");
//
//        sendText(email,"abc@gmail.com");
//        sendText(pswd,"12345");

        // Type 6: using  webelement utility class

        By email = By.id("email");
        By pswd = By.id("pass");

        ElementUtil eu = new ElementUtil(driver);

        eu.doSendKeys(email,"abc@124.com");
        eu.doSendKeys(pswd,"1234");




    }


}
