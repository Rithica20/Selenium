package testng.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AAATest {
    //AAA
    //Arrange Act Assert is universal principle to write test case
    // for example in testng we need to arrange test with priority
    // then explain the test case
    // then assert it


    // what if we dont write assertion in every test
    // coz its a principle and without asserttion that test case is called invalid test or robost test
    WebDriver driver;

    @BeforeTest // why before test instead of beforemethod because before test will be executed only once
    // if we use before method it will run after all @test
    public void setup(){
       driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       driver.get("https://www.zoho.com/");
    }

    @Test(priority = 1)
    public void getTitle(){
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

    @AfterTest
    public void tearUp(){
        driver.quit();
    }
}
