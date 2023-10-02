package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingStaleElementReferenceException {
    public static void main(String[] args) {

        // 1. In Fluent wait feature you can write .ignoring condition
        //2. To re intialize the list

        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.zoho.com/");
//
//        WebElement twitter = driver.findElement(By.xpath("//a[contains(@class,'twitter')]"));
//        WebElement facebook = driver.findElement(By.xpath("//a[contains(@class,'fb')]"));
//
//        twitter.click();
//        driver.navigate().refresh();
//        // becoause everytime we referesh the element id will be updated so existing element wil be lost
//
////        facebook.click();//staleElemenetReferenceException
//
//        facebook = driver.findElement(By.xpath("//a[contains(@class,'fb')]"));
//        facebook.click();

        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        List<WebElement> footerLinks = driver.findElements(By.cssSelector("footer a"));

        for(int i=0; i<footerLinks.size(); i++){
            footerLinks.get(i).click();//v4
            driver.navigate().back();//v5
            footerLinks = driver.findElements(By.cssSelector("footer a")); //v5
        }
    }
}
