package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {
    static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://html.com/attributes/select-multiple/");
        WebElement dd = driver.findElement(By.xpath("//select[@size='6']"));
        Select select = new Select(dd);

        if(select.isMultiple()){
            System.out.println("This is multiple option dropdown");
            select.selectByVisibleText("American flamingo");
            select.selectByValue("Chilean");
            select.selectByIndex(0);
            select.deselectAll();
        }
        else {
            System.out.println("This is not a muli option dropdown");
        }

    }
}
