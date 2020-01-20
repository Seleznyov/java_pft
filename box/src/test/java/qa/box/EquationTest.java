package qa.box;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EquationTest {

    @Test
    public void test0(){
        Equation e=new Equation(1,4,25);
        Assert.assertEquals(e.rootNumber(),0);
    }

    @Test
    public void test1(){
        Equation e=new Equation(1,4,4);
        Assert.assertEquals(e.rootNumber(),1);
    }

    @Test
    public void test3(){
        Equation e=new Equation(1,6,3);
        Assert.assertEquals(e.rootNumber(),2);
    }
}
