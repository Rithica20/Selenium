package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class ElementUtil {
    WebDriver driver;

    public ElementUtil(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElement(By locator) {

        return driver.findElement(locator);
    }

    public void doSendKeys(By locator, String value) {
        if (value == null) {
            System.out.println("Invalid input value cannot be null");
            throw new CustomException("Value cannot be null");
        }
        getElement(locator).sendKeys(value);
    }

    public String doElementGetText(By locator) {

        return getElement(locator).getText();
    }

    public Boolean checkElementIsDisplayed(By locator) {

        return getElement(locator).isDisplayed();
    }

    public String getElementAttribute(By locator, String attributename) {
        return getElement(locator).getAttribute(attributename);
    }

    public Boolean isElementDisabled(By locator) {

        return getElement(locator).isEnabled();
    }

    public String title() {

        return driver.getTitle();
    }

    public List<WebElement> getElements(By locator) {

        return driver.findElements(locator);
    }

    public int getSize(By locator) {

        return getElements(locator).size();
    }

    public List<String> getElementsImgList(By locator, String value) {
        List<WebElement> allImg = getElements(locator);
        List<String> allImgLinks = new ArrayList<>();
        for (WebElement e : allImg) {
            String allAttrValue = e.getAttribute(value);
            if (!allAttrValue.isEmpty()) {
                allImgLinks.add(allAttrValue);
            }
        }
        return allImgLinks;
    }

    public  List<String> getElementsTextList(By locator) {
        List<WebElement> totalList = getElements(locator);
        List<String> linkListText = new ArrayList<>();
        for (WebElement e : totalList) {
            String linkText = e.getText();
            if (!linkText.isEmpty()) {
                linkListText.add(linkText);
            }
        }
        return linkListText;
    }
    //*********** Select class utility ***************//
    public void selectFromDropDownByIndex(By locator,int index){
        Select select =  new Select(getElement(locator));
        if (index < 0){
            System.out.println("Index cannot be negative:");
            return; // this return statement will stop the execution of the program like custom exception
        }
        select.selectByIndex(index);
    }
    public void selectFromDropDownByValue(By locator,String value){

        if (value == null){
            System.out.println("value cannot be null");
            return;
        }
        Select select =  new Select(getElement(locator));
        select.selectByValue(value);
    }
    public void selectFromDropDownByText(By locator,String text){

        if(text == null){
            System.out.println("text cannot be null");
            return;
        }
        Select select =  new Select(getElement(locator));
        select.selectByVisibleText(text);
    }
    public int getCountOfAllOptionsInDropDown(By locator){
        Select select =  new Select(getElement(locator));
        List<WebElement> allOptions = select.getOptions();
        int size = allOptions.size();
        return size;
    }
    public List<String> getAllOptions(By locator){
        Select select =  new Select(getElement(locator));
        List<WebElement> allOptions = select.getOptions();
        List<String> textOptions = new ArrayList<>();
        for (WebElement e:allOptions){
            String text = e.getText();
            textOptions.add(text);
        }
        return textOptions;
    }
    public void selectDropdownWithoutTextMethod(By locator,String option) {
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
    public void selectDropdownWithoutValueMethod(By locator,String value,String option) {
        Select select = new Select(getElement(locator));
        List<WebElement> allOptions = select.getOptions();
        for (int i = 0; i < allOptions.size(); i++) {
            if (allOptions.get(i).getAttribute(value).contains(option)) {
                allOptions.get(i).click();
                System.out.println("clicked");
            }
        }
    }
//    public void selectDropdownWithoutValue(By locator,String value,String option){
//        Select select =  new Select(getElement(locator));
//        List<WebElement> allOptions = select.getOptions();
//        List<String> textOptions = new ArrayList<>();
//        int count = 0;
//        for (WebElement e:allOptions){
//            e.getAttribute(value).contains(option);
//            allOptions.get(count).click();
//            System.out.println("clicked");
//        }
//    }
}


