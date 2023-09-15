package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesConcept {
    static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
//        driver.get("http://www.londonfreelance.org/courses/frames/index.html");

//        driver.switchTo().frame(2); // with index
//        driver.switchTo().frame("main"); // with name
//        driver.switchTo().frame(driver.findElement(By.name("main"))); // with webelement
//        String text = driver.findElement(By.tagName("h2")).getText();
//        System.out.println(text);

        // *****  Nested frame concept  *****  //
//
//        driver.get("https://selectorshub.com/iframe-scenario/");
//        // frame 1
//        driver.switchTo().frame("pact1");
//        driver.findElement(By.id("inp_val")).sendKeys("Rithica");
//
//        //frame 2 which is inside frame 1
//        driver.switchTo().frame("pact2");
//        driver.findElement(By.id("jex")).sendKeys("Rubi");
//
//        //frame 3 which is inside frame 2
//        driver.switchTo().frame("pact3");
//        driver.findElement(By.id("glaf")).sendKeys("Ruck");
//
//        // Scenario:1 ---> 1-2-3 to main page
////        driver.switchTo().defaultContent();
////        String texttitle = driver.findElement(By.xpath("//div[@data-id='ed72f9e']//div[@class='elementor-widget-container']//slogan")).getText();
////        System.out.println(texttitle);
//
//        //Scenario:2 ----> 3-2-1
//        driver.switchTo().parentFrame(); //3 to 2
//        driver.findElement(By.id("jex")).sendKeys("updated");
//
//        driver.switchTo().parentFrame();// 2 to 1
//        driver.findElement(By.id("inp_val")).sendKeys("updated");
//
//        //Scenario :3 ----> 1 to main page
//        driver.switchTo().parentFrame();
//        String texttitle = driver.findElement(By.xpath("//div[@data-id='ed72f9e']//div[@class='elementor-widget-container']//slogan")).getText();
//        System.out.println(texttitle);


        // ***** iframes concept ******** //

        driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
        //frame will appear after clilcking in this image
        driver.findElement(By.xpath("//img[@title='Vehicle-Registration-Forms-and-Examples']")).click();

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'frame-one')]")));

        driver.findElement(By.id("RESULT_TextField-1")).sendKeys("rihtica");

        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.id("tooltip")).getText());

    }
}
