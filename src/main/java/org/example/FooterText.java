package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterText {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
       // driver.get("https://www.flipkart.com/");
        driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
        //driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        //WebElement e =driver.findElement(By.xpath("//a[text()='YouTube']/parent::div[@class='_2Brcj4']/div"));

//        String a1 = flipkartFooter("Contact Us");
//       // System.out.println(a1);
//        String a2 = flipkartFooter("Shipping");
//        String a3 = flipkartFooter("Sitemap");
//        String a4 = flipkartFooter("Twitter");
//
//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);
//        System.out.println(a4);

        String a1 = orangeHrmFooter("Commercial License");
        String a2 = orangeHrmFooter("Our Offices");
        String a3 = orangeHrmFooter("Testimonials");
        String a4 = orangeHrmFooter("News Articles");


        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

    }
    private static String flipkartFooter(String link){
       return  driver.findElement(By.xpath("//a[text()='"+link+"']/parent::div[@class='_2Brcj4']/div")).getText();
    }
    private static String orangeHrmFooter(String link){
        return driver.findElement(By.xpath("//a[normalize-space()='"+link+"']/parent::li/parent::ul/parent::div/h5")).getText();
    }
}
