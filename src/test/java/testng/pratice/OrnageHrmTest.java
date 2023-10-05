package testng.pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrnageHrmTest extends BaseTest{

//    WebDriver driver;

//    @BeforeTest
//    public void setup(){
//        driver = new ChromeDriver();
//        driver.manage().deleteAllCookies();
//        driver.manage().window().maximize();
//        driver.get("https://www.orangehrm.com/30-day-free-trial/");
//    }

    @Test(priority = 1)
    public void TitleTest() {
//        driver.get("https://www.orangehrm.com/30-day-free-trial/");
        Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
    }

    @Test(priority = 2)
    public void URLTest() {
        Assert.assertTrue(driver.getCurrentUrl().contains("30-day-free-trial"));
    }
//    @AfterTest
//    public void teardown(){
//        driver.quit();
//    }
}
