package testng.pratice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InnvocationCountTest {
    @Test(invocationCount = 10,priority = 1)
    public void sudhakarTest(){
        System.out.println("this is my test method sudhakar");
        Assert.assertEquals("rithica","rithica");
    }
    @Test(priority = 1)
    public void kayalTest(){
        System.out.println("this is my test method kayal");
        Assert.assertEquals("rithica","rithica");
    }
}
