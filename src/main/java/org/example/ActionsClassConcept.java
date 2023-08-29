package org.example;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassConcept {

    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
//        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");


//        Actions actions = new Actions(driver);
////        By src_ele = By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'][position()=1]");
//////        By dest_ele = By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']");
//        By click = By.xpath("//li[@id='Accepted Elements']");
//        By src_ele = By.id("draggable");
//        By dest_ele = By.id("droppable");
//
//        Thread.sleep(3000);
//        getElement(click).click();
//        Thread.sleep(3000);
//        actions.clickAndHold(getElement(src_ele))
//                .moveToElement(getElement(dest_ele))
//                    .release()
//                        .perform();

        //without build and without perform ---not valid
        //with build alone ---not valid
        //with perform alone - valid
        //with build and with perform - valid

//
////        driver.get("https://demo.automationtesting.in/Static.html");
//        By src_elec = By.xpath("//div[@class='col-xs-10 col-xs-offset-2']/img[@id='angular']");
//        By des_ele =By.xpath("//div[@class='dragged']/p");
//
//        Thread.sleep(2000);
//        // the below method is said to be method chaining and this how dag and drop method works
//        actions.clickAndHold(getElement(src_elec))
//                .moveToElement(getElement(des_ele))
//                .release()
//                .perform();


//        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
//        By src_ele = By.id("draggable");
//        By dest_ele = By.id("droppable");
//
//        Thread.sleep(2000);
//        // the below method is said to be method chaining and this how dag and drop method works
//        actions.clickAndHold(getElement(src_ele))
//                .moveToElement(getElement(dest_ele))
//                .release()
//                .perform();
//
//        actions.dragAndDrop(getElement(src_ele),getElement(dest_ele)).perform();

//        dragAndDropOperation(src_ele,dest_ele);

//       moveToElement concept
//        driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");
//        Actions actions = new Actions(driver);
//        By ele = By.className("menulink");
//        By sec_option = By.linkText("COURSES");
//
////        actions.moveToElement(getElement(ele)).perform();
////        getElement(sec_option).click();
//
//        twoLevelOfMenuHandling(ele,"COURSES");

        // RightClick concept
        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        By btn = By.xpath("//span[text()='right click me']");
        By next_option = By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-paste']");

//        Actions actions =new Actions(driver);
//        actions.contextClick(getElement(btn)).perform();
//        getElement(next_option).click();
        rightClickOperation(btn,"Paste");

    }
    public static WebElement getElement(By locator){
        return driver.findElement(locator);
    }
    public static void dragAndDropOperation(By src_locator,By dest_locator){
        Actions actions =new Actions(driver);
        actions.dragAndDrop(getElement(src_locator),getElement(dest_locator)).perform();
    }

    
    public static void twoLevelOfMenuHandling(By locator1, String submenu){
        Actions actions =new Actions(driver);
        actions.moveToElement(getElement(locator1)).perform();
        By sec_option = By.linkText(""+submenu+"");
        getElement(sec_option).click();
    }
    public static void rightClickOperation(By locator,String optionValue){
        By next_option = By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-paste']");

        Actions actions =new Actions(driver);
        actions.contextClick(getElement(locator)).perform();
        By option = By.xpath("//*[text()='"+optionValue+"']");
        getElement(next_option).click();
    }
}
