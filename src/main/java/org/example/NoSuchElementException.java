package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementException {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        By fprgot = By.linkText("Forgottenn Password");
        ElementUtil eu = new ElementUtil(driver);
        String text=getElement(fprgot).getText();
        System.out.println(text);
        String tt = title();
        System.out.println(tt);
    }
    private static WebElement getElement(By locator){
       return driver.findElement(locator);
    }
    private static String title(){

        return  driver.getTitle();
    }
}
