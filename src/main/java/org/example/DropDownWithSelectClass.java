package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropDownWithSelectClass {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        Thread.sleep(4000);

        By dropDown = By.xpath("//select[@id='searchDropdownBox']");
        Select select =  new Select(driver.findElement(dropDown));

//        //By index
//        select.selectByIndex(5);
//        //By value
//        select.selectByValue("search-alias=baby-products-intl-ship");
//        //By text
//        select.selectByVisibleText("Computers");
//
//        //Using utility methods
//        selectFromDropDownByIndex(dropDown,6);
//        selectFromDropDownByText(dropDown,"Computers");
//        selectFromDropDownByValue(dropDown,"search-alias=baby-products-intl-ship");
//
//        //select dropdown with options
//        int size = getCountOfAllOptionsInDropDown(dropDown);
//        System.out.println(size);
//        List<String> allAvailableOptions = getAllOptions(dropDown);
//        System.out.println(allAvailableOptions);
//
//        //select dropdown without value text index methods
//       //selectDropdownWithoutTextMethod(dropDown,"Computers");
//
//        selectDropdownWithoutValueMethod(dropDown,"value","search-alias=baby-products-intl-ship");

        //Select dropdown without select class
        getElement(dropDown).sendKeys("Computers");


    }
    public static WebElement getElement(By locator){

        return driver.findElement(locator);
    }
    public static void selectFromDropDownByIndex(By locator,int index){
        Select select =  new Select(getElement(locator));
        if (index < 0){
            System.out.println("Index cannot be negative:");
            return; // this return statement will stop the execution of the program like custom exception
        }

        select.selectByIndex(index);
    }
    public static void selectFromDropDownByValue(By locator,String value){

        if (value == null){
            System.out.println("value cannot be null");
            return;
        }
        Select select =  new Select(getElement(locator));
        select.selectByValue(value);
    }
    public static void selectFromDropDownByText(By locator,String text){

        if(text == null){
            System.out.println("text cannot be null");
            return;
        }
        Select select =  new Select(getElement(locator));
        select.selectByVisibleText(text);
    }
    public static int getCountOfAllOptionsInDropDown(By locator){
        Select select =  new Select(getElement(locator));
        List<WebElement> allOptions = select.getOptions();
        int size = allOptions.size();
        return size;
    }
    public static List<String> getAllOptions(By locator){
        Select select =  new Select(getElement(locator));
        List<WebElement> allOptions = select.getOptions();
        List<String> textOptions = new ArrayList<>();
        for (WebElement e:allOptions){
            String text = e.getText();
            textOptions.add(text);
        }
        return textOptions;
    }
    public static void selectDropdownWithoutTextMethod(By locator,String option) {
        Select select = new Select(getElement(locator));
        List<WebElement> allOptions = select.getOptions();
        List<String> textOptions = new ArrayList<>();
        for (int i = 0; i < allOptions.size(); i++) {
            if (allOptions.get(i).getText().contains(option)) {
                allOptions.get(i).click();
                System.out.println("clicked");
            }
        }
    }
    public static void selectDropdownWithoutValueMethod(By locator,String value,String option) {
        Select select = new Select(getElement(locator));
        List<WebElement> allOptions = select.getOptions();
        for (int i = 0; i < allOptions.size(); i++) {
            if (allOptions.get(i).getAttribute(value).contains(option)) {
                allOptions.get(i).click();
                System.out.println("clicked");
            }
        }
    }
    public static void selectDropdownWithoutValue(By locator,String value,String option){
        Select select =  new Select(getElement(locator));
        List<WebElement> allOptions = select.getOptions();
        List<String> textOptions = new ArrayList<>();
        int count = 0;
        for (WebElement e:allOptions){
            e.getAttribute(value).contains(option);
            allOptions.get(count).click();
            System.out.println("clicked");
        }
    }
}
