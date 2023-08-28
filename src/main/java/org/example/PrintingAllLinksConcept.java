package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PrintingAllLinksConcept {
    static WebDriver driver;

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        By allLinks = By.tagName("a");
        List<WebElement> totalLinks = driver.findElements(allLinks);

        int totalCount = totalLinks.size();
//
//        for (int i=0; i<totalCount; i++){
//            String linksName = totalLinks.get(i).getText();
//            if(!linksName.isEmpty()){
//                System.out.println(i+":"+linksName);
//            }
//            else {
//                System.out.println(i);
//            }
            int count=1;
            for (WebElement e:totalLinks) {
                String linksName1 = e.getText();
                if (!linksName1.isEmpty()){
                    System.out.println(count+":"+linksName1);
                }
                count++;
            }

        }

    }

