package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
}


