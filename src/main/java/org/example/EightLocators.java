package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EightLocators {
    // 8 Types of locator
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
        //1. Id unique locator (attribute) -- I
        WebElement firstname = driver.findElement(By.id("input-firstname"));
        firstname.sendKeys("rithica");

        //2.Name  can be duplicate, 99% name will be unique (attribute) -- II
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("B");

        //3.Classname can be duplicate and most of the time its duplicate (attribute) --- III
        WebElement search = driver.findElement(By.className("form-control"));
        search.sendKeys("transactions");

        //4.tagname : html tag, not an attribute
        Boolean img = driver.findElement(By.tagName("img")).isDisplayed();
        System.out.println(img);

        // 5. LinkText only for links...with the text of the link.
        Boolean link = driver.findElement(By.linkText("Forgotten Password")).isDisplayed();
        System.out.println(link);

        // 6. Partial Link text only for links...with the partial text of the link.
        Boolean partialtext = driver.findElement(By.partialLinkText("Address")).isDisplayed();
        System.out.println(partialtext);

        //7. CSS selector: more fast than xpath, it is not an attribute
        WebElement pass = driver.findElement(By.cssSelector("#input-password"));
        pass.sendKeys("abc123");

        //8.Xpath not an attribute...address of the element in HTML DOM
        WebElement radiobtn = driver.findElement(By.xpath("//label[@class='radio-inline']//input[@value='1']"));
        radiobtn.click();

        System.out.println("all the above locators are correct test is passed");

        driver.quit();

    }
}
