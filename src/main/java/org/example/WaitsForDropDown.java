package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WaitsForDropDown {
    static WebDriver driver;

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");

        By dd = By.xpath("//select");
//        List<WebElement> all =driver.findElements(dd);
//        System.out.println(all.size());
        List<WebElement> allElements = visibilityofAllElementsLocated(10, dd);
        System.out.println(allElements.size());


    }

    /**
     * This method will check whether all the list of elements is visible on the web page
     * @param time
     * @param locator
     * @return
     */
    public static List<WebElement> visibilityofAllElementsLocated(int time, By locator){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    /**
     * this method will check whether atleast one element is visible on the page
     * @param time
     * @param locator
     * @return
     */
    public static List<WebElement> presenceOfAllElementsLocatedBy(int time, By locator){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }

}
