package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Sample {
    public static void main(String[] args) {
      //  ChromeDriver driver =new ChromeDriver();
        SafariDriver driver = new SafariDriver();
        driver.get("https://www.facebook.com/");
        String t = driver.getTitle();
        System.out.println(t);

        if (t.equals("Facebook – log in or sign up")){
            System.out.println("given title is correct:"+t);
        }
        else{
            System.out.println("given title is incorrect:"+t);
        }

        driver.quit();

    }
}
