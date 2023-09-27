package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsForWindows {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.zoho.com/");



        driver.findElement(By.xpath("//a[contains(@class,'twitter')]")).click();
        driver.findElement(By.xpath("//a[contains(@class,'fb')]")).click();
        driver.findElement(By.xpath("//a[contains(@class,'instagram')]")).click();

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        if (wait.until(ExpectedConditions.numberOfWindowsToBe(4))){
//            System.out.println("all the four windows are opened");
//        }
//        else System.out.println("windows is not opened");
        numberOfWindowsToBe(20,4);
    }
    public static void numberOfWindowsToBe(int time,int totalWindows){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        if (wait.until(ExpectedConditions.numberOfWindowsToBe(totalWindows))){
            System.out.println("all the "+totalWindows+" windows are opened");
        }
        else System.out.println(""+totalWindows+"windows is not opened");
    }
}
