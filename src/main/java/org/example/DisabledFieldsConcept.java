package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledFieldsConcept {

    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");

        By pswd = By.id("passnew");
        getElemenent(pswd).sendKeys("asdfg");
//        Boolean value = getElemenent(pswd).isEnabled();
//        System.out.println(value);
//
//        String evalue = getElementAtrribute(pswd,"disabled");
//        System.out.println(evalue);
//
//        if(evalue.equals("true")){
//            System.out.println("element is diabled");
//        }
//        else {
//            System.out.println("element is enabled");
//        }

    }
    private static WebElement getElemenent(By locator){

        return driver.findElement(locator);
    }
    private static Boolean isElementDisabled(By locator){

        return getElemenent(locator).isEnabled();
    }
    private static Boolean isElementDisplayed(By locator){
        return getElemenent(locator).isEnabled();
    }
    private static String getElementAtrribute(By locator,String text){
        return getElemenent(locator).getAttribute(text);
    }


//    private static Boolean isElementDisabled(By locator){
//        String value =  getElementAttribute(locator,"disabled");
//        if(value.equals("true")){
//          return true;
//        }
//       return false;
//    }

    }
