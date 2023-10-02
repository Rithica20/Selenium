package testng.pratice;

import org.testng.annotations.Test;

public class ExpectedException {
     String name;

    @Test(expectedExceptions = ArithmeticException.class)
    public void cartTest(){
        System.out.println("eliminating arithmetic exception");
        int a=9/0;
    }
    @Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
    public void searchTest() {
        System.out.println("searchTest");
        int i = 9/0;//AE

        ExpectedException obj = new ExpectedException();
        obj = null;
        obj.name = "rithica";//NPE
    }
}
