package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextGetAttributeConcepts {

    static WebDriver driver;

    public static void main(String[] args) {
            driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

        ElementUtil eu = new ElementUtil(driver);

        // getText: used to fetch text from webelement
        WebElement text = driver.findElement(By.xpath("//fieldset//legend[text()='Your Personal Details']"));
        String text1 = text.getText();
        System.out.println(text1);

        By getText = By.xpath("//fieldset//legend[text()='Your Personal Details']");
        if(eu.checkElementIsDisplayed(getText)) {
            String textvalue = eu.doElementGetText(getText);
            System.out.println("The given text is present:" + textvalue);
            if (textvalue.equals("Your Personal Details")) {
                System.out.println("testcase is pass");
            } else {
                System.out.println("test case is fail");
            }
        }
        else {
            System.out.println("The given text is not displayed");
        }

        //getAttribute: used to fetch values of an attribute

        By attvalue = By.id("input-telephone");
        eu.getElement(attvalue).sendKeys("12345678");
        String attributevalue = eu.getElement(attvalue).getAttribute("value");
        System.out.println(attributevalue);

        String attribute1 = eu.getElementAttribute(attvalue,"value");
        System.out.println(attribute1);


       String type = driver.findElement(attvalue).getAttribute("type");
        String name = driver.findElement(attvalue).getAttribute("name");
        String id = driver.findElement(attvalue).getAttribute("id");
        String className =driver.findElement(attvalue).getAttribute("class");

        System.out.println("attribute value is:: "+type);
        System.out.println("attribute value is:: "+name);
        System.out.println("attribute value is:: "+id);
        System.out.println("attribute value is:: "+className);

    }

}
