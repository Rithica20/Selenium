package org.example;

import org.openqa.selenium.WebDriver;

public class ImplementingBrowserUtil {

    private static WebDriver driver;


//    public static void main(String[] args) throws CustomException {
//        BrowserUtil browserUtil =new BrowserUtil();
//
//        browserUtil.launchBroswer("abc");
//        browserUtil.launchUrl("https://www.amazon.com");
//        String title = browserUtil.title();
//        System.out.println(title);
//
//    }

    public static void main(String[] args) {
        BrowserUtil bu = new BrowserUtil();
        bu.launchBroswer("caaa");
        bu.launchUrl("https://amazon.com");
        String title = bu.title();
    }
}
