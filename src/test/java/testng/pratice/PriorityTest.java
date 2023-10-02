package testng.pratice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTest {

    @Test(priority = 1)
    public void rithicaTest(){
        System.out.println("this is my test method rithica");
        Assert.assertEquals("rithica","rithica");
    }
    @Test(priority = 0)
    public void sudhakarTest(){
        System.out.println("this is my test method sudhakar");
        Assert.assertEquals("rithica","rithica");
    }
    @Test(priority = -1)
    public void kayalTest(){
        System.out.println("this is my test method kayal");
        Assert.assertEquals("rithica","rithica");
    }

    @Test
    public void athulTest(){
        System.out.println("this is my test method athul");
        Assert.assertEquals("rithica","rithica");
    }

}
