package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigateCloseQuit {
    public static void main(String[] args) throws MalformedURLException {

        ChromiumDriver driver = new ChromeDriver();
        driver.get("fvbnm.com");
        driver.navigate().to(new URL("https://amazon.com"));
        driver.navigate().refresh();
        driver.navigate().to("https://facebook.com");
        driver.navigate().back();
        driver.navigate().forward();
        //driver.close();// Exception in thread "main" org.openqa.selenium.NoSuchSessionException: invalid session id
        driver.quit(); // Session ID is null. Using WebDriver after calling quit()?
        driver.getTitle();


    }
}
