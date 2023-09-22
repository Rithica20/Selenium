package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HandlingWindows {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();

        Set<String> allWindows = driver.getWindowHandles();
        System.out.println(allWindows);

        //[973E3E4ED72C3E0219247F18B3125DE8, C8F6F9AC6372DF9A4DD60780CEDB4376]
        //[C32CB329B0674D617A3CBA600C7C5732, 0419161B0782971B512230542D568C65]

        Iterator<String> eachWindow = allWindows.iterator();

 //       String parentorchildWindow = eachWindow.next();

//        driver.switchTo().window(parentorchildWindow);
//        System.out.println(driver.getTitle());
//        //[1E0CDEBB89BEFE117301F352D5084462, 8E8C9974F3096C4FE7527BDCAA109458]
//        //OrangeHRM

        String parentWindow = eachWindow.next();

        driver.switchTo().window(parentWindow);
        System.out.println("------------------------------------");
        System.out.println("The parent window session is "+parentWindow);
        System.out.println(driver.getTitle());

        String childWindow = eachWindow.next();
        System.out.println("------------------------------------");
        driver.switchTo().window(childWindow);
        System.out.println("The child Window  session is "+childWindow);
        System.out.println(driver.getTitle());

        System.out.println("------------------------------------");
//        driver.switchTo().window(parentWindow);  --> no need to write this
        System.out.println("The title of the parent window is "+driver.getTitle());
    }
}
