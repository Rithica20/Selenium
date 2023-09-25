package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HandlingSvgElements {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
          driver = new ChromeDriver();
//          driver.get("https://petdiseasealerts.org/forecast-map");
//          driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
//
//            ////*[local-name()='svg']//*[name()='g' and @id='texas'].
//           // List<WebElement> states = driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']"));
//        List<WebElement> states = driver.findElements(By.xpath("//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']"));
//
//
//        Actions actions = new Actions(driver);
//        for (WebElement e:states){
//            actions.moveToElement(e).perform();
//            Thread.sleep(500);
//            String text = e.getAttribute("name");
//            System.out.println(text);
//        }

        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//span[@role='button']")).click();
        driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("samsung");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[local-name()='svg' and @fill='none']//*[name()='title' and text()='Search Icon']")).click();
        // for the above line it is throwing
        //Exception in thread "main" org.openqa.selenium.ElementNotInteractableException: element not interactable: element has zero size
    }
}
