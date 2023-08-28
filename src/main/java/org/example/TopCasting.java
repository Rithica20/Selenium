package org.example;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCasting {

    public void main() {


        WebDriver driver = new ChromeDriver();
        SearchContext sc = new ChromeDriver();// valid not recommended

        RemoteWebDriver rd = new ChromeDriver();

        //driver.findElement()

        //driver.findElements(By.id)//  coming

        ChromiumDriver dr = new ChromeDriver();
        ChromiumDriver dr1 = new EdgeDriver();
        // WebDriver d =new RemoteWebDriver(); valid for remote execution

    }
}
