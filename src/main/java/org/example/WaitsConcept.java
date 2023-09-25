package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class WaitsConcept {
    public static void main(String[] args) {
        //Wait: Selenium Script <---> Browser(App)
        //1. static wait - Thread.sleep(10000);//10-2=8 || 10-12 : JAVA
        //2. dynamic wait: 10-2=8(cancelled) || 10-12: NSE

        //10x100 = 1000s


        //dynamic wait: Selenium Lib
        //a. Implicitly Wait
        //b. Explicit Wait:
        //b.1: WebDriverWaitClass
        //b.2: FluentWait


        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//this is used in se+ 3
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel 4.x
        //imp wait: global wait:
        //its applicable for all the web elements by default
        // implicit wait will wait for every element suppose if we have 1000 elements in a page it will check
        //for every element is loaded or not those milli seconds of checking will be wasted so
        // it is not recommended to use this implicit wait in a project

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.zoho.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //login page: 10
        //driver.findElement(By.name("username")).sendKeys("admin");//10-5=5
        //e2 -- 10 -- password -> 10 --> 0
        //e3 -- 10 -- login button--> 10 ---> 0
        //e4 -- 10
        //e100 -- 10

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//sel 4.x
        //homepage: 20
        //he1 -- 20
        //he2 -- 20
        //logout

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel 4.x
        //loginpage: 10 secs
        //e2 -- 10
        //e3 -- 10
        //e4 -- 10

        //payment page: 0 secs: nullification of imp wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel 4.x


        //un - 10
        //pwd - 5
        //login - 20
        //ele - 0
        //wont work for non web elements: title, url, alert

        //logout: loginpage: 10
        //123
        driver.quit();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//sel 4.x
        //payment: 5



        /******** END OF IMPLICIT WAIT******/

        //ExplicitWait:
        //1. WebDriverWaitClass
        //2. FluentWait


        //WebDriverWaitClass(C) --> FluentWait(C) --> Wait(I): until();
        //inherit from FW		//until(){}
        //No indv methods		//+other methods

        //exp wait:
        //not a global wait
        //will be applied for the specific element
        //un - 10 --> 5 = 5
        //pwd = 0 wait
        //logn = 0 wait
        //can be applied for non web elements: url, title, alerts
        //expectedconditions ---> various conditons
    }
}
