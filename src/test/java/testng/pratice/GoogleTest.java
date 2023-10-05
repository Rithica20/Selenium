package testng.pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
//    WebDriver driver;

//    @BeforeTest
//    public void setup(){
//        driver = new ChromeDriver();
//        driver.manage().deleteAllCookies();
//        driver.manage().window().maximize();
//        driver.get("https://www.zoho.com/");
//    }

    @Test(priority =1)
    public void googleTitle(){
//        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
    }
    @Test(priority = 2)
    public void googleUrl(){
        System.out.println(driver.getCurrentUrl());
    }

//    @AfterTest
//    public void teardown(){
//        driver.quit();
   // }
}
