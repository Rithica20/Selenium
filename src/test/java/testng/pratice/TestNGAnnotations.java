package testng.pratice;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGAnnotations {
    //global pre condition
    //pre condition
    //test steps + exp vs act --> assertion --> P/F
    //post steps

//    @BeforeSuite -connectdb
//    @BeforeTest - create user
//    @BeforeClass - launch browser
//
//    @BeforeMethod - login to app ---precondtion for test methods
//
//    @Test-1
//    @Test-2
//
//    @AfterMethod- logout from app
//
//    @AfterClass- quit browser
//    @AfterTest- delete user
//    @AfterSuite- disconnect db

    @BeforeSuite
    public void connectDB(){
        System.out.println("This is my beforesuite method to connect db");
    }
    @BeforeTest
    public void createUser(){
        System.out.println("This is my beforeTest method to createUser");
    }
    @BeforeClass
    public  void launchBroswer(){
        System.out.println("This is my Before class method to launch browser");
    }

    @BeforeMethod
    public void loginToApp(){
        System.out.println("This is my Before method to log in to the app");
    }
    @Test
    public void searchTest(){
        System.out.println("This is my test method to search");
        Assert.assertEquals("mac","mac");
    }
    @Test
    public void cartTest(){
        System.out.println("This is my test method to cart");
        Assert.assertEquals("phone","phone");
    }
    @Test
    public void orderTest(){
        System.out.println("This is my test method to cart");
        Assert.assertEquals("order","order");
    }
    @AfterMethod
    public void logoutApp(){
        System.out.println("This is my after method to log out to app");
    }
    @AfterClass
    public void quitBrowser(){
        System.out.println("This is my after class method to quit browser");
    }
    @AfterTest
    public void deleteUser(){
        System.out.println("This is my after test method to delete user");
    }
    @AfterSuite
    public void disconnectDB(){
        System.out.println("This is my after suite method to disconnect db");
    }
}
