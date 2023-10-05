package testng.pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginWithMultipleInputs {
    WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
    }
    @DataProvider
    public Object[][] input(){
      return new Object[][]
                {
                        {"abc123@gmail.com","test123"},
                        {"test123@gmail.com","fghjk"},
                        {"test121212@.@.@gmail.com", "test@12121212121"},
                        {"!@#!@#!@#", "test12121"}
                };
    }
    @DataProvider
    public Object[][] searchInput(){
        return new Object[][]{
                {"mac"},
                {"iphone"},
                {"samsung"},
                {"phone"}
        };
    }
    @Test(dataProvider = "input",priority = 1)
    public void login(String mail, String pswd){
        driver.findElement(By.name("email")).sendKeys(mail);
        driver.findElement(By.name("password")).sendKeys(pswd);
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        String msg = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
        Assert.assertEquals(msg,"Warning: No match for E-Mail Address and/or Password.");
    }
    @Test(dataProvider = "searchInput",priority = 2)
    public void searchProduct(String productname){
        WebElement search = driver.findElement(By.name("search"));
        search.sendKeys(productname);
        driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
        search.clear();
        String msg = driver.findElement(By.xpath("//div[@id='content']")).getText();
        Assert.assertEquals(msg,"Search - "+productname+"");
    }
    @AfterTest
    public void teardown(){
        driver.quit();
    }
}
