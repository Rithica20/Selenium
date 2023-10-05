package testng.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ZohoTest extends BaseTest{
 //   WebDriver driver;

//    @BeforeTest
//    public void setup(){
//        driver = new ChromeDriver();
//        driver.manage().deleteAllCookies();
//        driver.manage().window().maximize();
//        driver.get("https://www.zoho.com/");
//    }
    @Test(priority = 1)
    public void getTitle(){
//        driver.get("https://www.zoho.com/");
        System.out.println("this is my title method");
        Assert.assertEquals(driver.getTitle(),"Zoho | Cloud Software Suite for Businesses");
    }
    @Test(priority = 2)
    public void getUrl(){
        System.out.println("This is my url method");
        Assert.assertTrue(driver.getCurrentUrl().contains("zoho"));
    }
    @Test(priority = 3)
    public void clickButton(){
        System.out.println("this is my click method");
        driver.findElement(By.xpath("//a[text()='Get Started For Free']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("signup"));
    }
//    @AfterTest
//    public void teardown(){
//        driver.quit();
//    }
}
