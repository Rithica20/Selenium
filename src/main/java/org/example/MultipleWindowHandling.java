package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindowHandling {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        Thread.sleep(3000);
//
//        String parentwindow = driver.getWindowHandle();
//
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
//        driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
//        driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
//        driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
//
//        Set<String> allwindows = driver.getWindowHandles();
//
//        Iterator<String> it = allwindows.iterator();
//
//        while (it.hasNext()){
//            String eachwindow = it.next();
//            driver.switchTo().window(eachwindow);
//            System.out.println(driver.getTitle());
//
//            if (!eachwindow.equals(parentwindow)){
//                driver.close();
//            }
//        }
//        driver.switchTo().window(parentwindow);
//        System.out.println("The parent window is:: "+driver.getTitle());




        //same process using zoho

        driver.get("https://www.zoho.com/");
        String parentwindow = driver.getWindowHandle();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[contains(@class,'twitter')]")).click();
        driver.findElement(By.xpath("//a[contains(@class,'fb')]")).click();
        driver.findElement(By.xpath("//a[contains(@class,'instagram')]")).click();
        //driver.findElement(By.xpath("//a[contains(@class,'li')]")).click();
        driver.findElement(By.xpath("//a[contains(@class,'youtube')]")).click();

        Set<String> allwindows = driver.getWindowHandles();
        Iterator<String> eachwindow = allwindows.iterator();

        while (eachwindow.hasNext()){
            String onewindow = eachwindow.next();
            driver.switchTo().window(onewindow);
            System.out.println(driver.getCurrentUrl());

            if (!onewindow.equals(parentwindow)){
                driver.close();
            }
        }
        driver.switchTo().window(parentwindow);
        System.out.println("the parent window title is::"+driver.getTitle());
        driver.quit();
    }
}
