package testng.pratice;

import org.testng.annotations.Test;

public class DependsOnAttribute {

    // if we use priority and dependsonmethod
    //testng will take dependsonmethod only
    //it will not give priority to priority=1

    //we have to write test method as independent as possible
    // because when one test fails all other dependent test will be ignored

    //test method should be independent as possible because
    //and we should not write more than one assertation
    // because when one assertation fails all other
    // remamining code will not be executed after one assertion
    @Test(priority = 2)
    public void getLogin(){ // I > Url > login
        System.out.println("this is my login method");
        int a = 9/0;
        System.out.println("sahil");
    }

    @Test(dependsOnMethods = "getLogin", priority = 1)
    public void searchProduct(){ // I > url > Login > search
        System.out.println("this is my search method");
    }

    @Test(dependsOnMethods = "searchProduct", priority = 3)
    public void checkout(){// I > url > Login > search > Add to cart > Checkout
        System.out.println("this is my checkout method");
    }
}
