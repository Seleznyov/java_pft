package qa.box;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SquerTest {

    @Test
    public  void  test(){
        Squer s = new Squer(5);
        Assert.assertEquals( s.second_function(),25.0);
    }
}
