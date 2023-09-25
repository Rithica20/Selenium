package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitsForTitle {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://www.zoho.com/");

        System.out.println(driver.getTitle());

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        try {
//            if (wait.until(ExpectedConditions.titleIs("Zoho | Cloud Software Suite for Businesses"))) {
//                System.out.println("title is correct");
//            }
//        }
//        catch (Exception e){
//            e.printStackTrace();
//            System.out.println("tile not found");
//        }
        titleIs("Zoho | Cloud Software Suite for Businesses",20);
        titleContains("Zoho",20);
    }
    public static void titleIs(String title,int time){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        try {
            if (wait.until(ExpectedConditions.titleIs(title))) {
                System.out.println("title is correct");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("tile not found");
        }
    }
    public static void titleContains(String title, int time){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
        try {

            if (wait.until(ExpectedConditions.titleContains(title))) {
                System.out.println("fraction of title is correct");
            }
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("fraction of title does not found");
        }

    }
    public static String urlContains(String urlFraction, int timeout) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        try {
            if (wait.until(ExpectedConditions.urlContains(urlFraction))) {
                System.out.println("url fraction is correct");
                return driver.getCurrentUrl();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("url fraction not found");
        }
        return null;
    }
}

