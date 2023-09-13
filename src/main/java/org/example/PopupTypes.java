package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupTypes {
    static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();

        // The popup with usrname and pswd is known as basic auth popup
        //driver.get("https://the-internet.herokuapp.com/basic_auth");
        // This will ask for username and password
      //  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        //For this we are adding admin:admin @ means this url will start form there
//
//        String usr = "admin";
//        String pswd = "admin";
//        driver.get("https://"+usr+":"+pswd+"@the-internet.herokuapp.com/basic_auth");

        //File upload from window popup -----> this method is appplicable only when attribute type is equal to file
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("file-upload")).sendKeys("/Users/rithica/Downloads/rithicaa.csv");

        //what if type=file is not availabe?
        //1. ask your dev team to add this attribute
        //2. Robot class -- not recommended -- only for windows. wont work for linux, mac, docker, cloud, jenkins, headless, grid
        //3. autoIt -- not recommended -- only for windows. wont work for linux, mac, docker, cloud, jenkins, headless, grid
        //4. sikuli -- not recommended -- coz its based image processing

        // handling cookies popup
        // for the we can find xpath and click on the button
    }
}
