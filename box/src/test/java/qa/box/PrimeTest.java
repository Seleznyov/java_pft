package qa.box;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTest {

    @Test
    public void testPrime() {
        Assert.assertTrue(Primes.isPrimeFor(Integer.MAX_VALUE));
    }

    @Test
    public void testPrime2() {
        Assert.assertFalse(Primes.isPrimeFor(Integer.MAX_VALUE - 2));
    }


    @Test
    public void testPrime3() {
        Assert.assertTrue(Primes.isPrimeWhile(Integer.MAX_VALUE));
    }

    @Test
    public void testPrime4() {
        Assert.assertTrue(Primes.isPrimeFaste(Integer.MAX_VALUE));
    }
}