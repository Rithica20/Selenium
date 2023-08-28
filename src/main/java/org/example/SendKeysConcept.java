package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysConcept {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        String s="12345";
        StringBuffer s1= new StringBuffer("1234567");
        StringBuilder s2= new StringBuilder("1098765");
        // all the above string classes implements charsequence interface
        // we can use this in sendkeys as it uses input type charsequence

        By getText = By.xpath("//fieldset//legend[text()='Your Personal Details']");
//        driver.findElement(getText).sendKeys(s,s1,s2);
//        driver.findElement(getText).sendKeys(s+s1+s2);
//        driver.findElement(getText).sendKeys(s);
//        driver.findElement(getText).sendKeys(s1);
//        driver.findElement(getText).sendKeys(s2);

  //     doSendKeys(getText,null);// here we get invalidarugument exception
    }
//    private static WebElement getElement(By locator){
//        return driver.findElement(locator);
//    }
//    private static void doSendKeys(By locator, String value){
//
//
//        if (value == null){
//            System.out.println("Invalid input value cannot be null");
//        }
//        getElement(locator).sendKeys(value);
//    }

    }
