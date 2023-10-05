package testng.pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {
    WebDriver driver;
    @Parameters({"broswername","url"})
    @BeforeTest
    public void setup(String browser, String url){
        switch (browser.toLowerCase()){
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                System.out.println("please enter valid browser name:: "+browser);
        }
        driver.get(url);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

    }
    @AfterTest
    public void teardown(){
        driver.quit();
    }
}
