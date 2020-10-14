package PrimeFunctions;

import org.junit.Assert;
import org.junit.Test;

public class IsPrimeTest {

    IsPrime funcPrime = new IsPrime();
    Double testNumber = 18446744082299486207.;

    @Test
    public void isPrime_49_Test() {
        testNumber = 49.;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %f", testNumber), false, actual);
    }

    @Test
    public void isPrime_37_Test() {
        testNumber = 37.;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %f", testNumber), true, actual);
    }

    @Test
    public void isPrime_440101_Test() {
        testNumber = 440101.;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %f", testNumber), true, actual);
    }

    @Test
    public void isPrime_5600748293801_Test() {
        Double testNumber =  5600748293801.;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %f", testNumber), true, actual);
    }

    @Test
    public void isPrime_982451653_Test() {
        testNumber = 982451653.;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %f", testNumber), true, actual);
    }

    @Test
    public void isPrime_179426029_Test() {
        testNumber = 179426029.;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %f", testNumber), true, actual);
    }

    @Test
    public void isPrime_neg83_Test() {
        testNumber = -83.;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %f", testNumber), false, actual);
    }

    @Test
    public void isPrime_1_Test() {
        testNumber = 1.;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %f", testNumber), false, actual);
    }

    @Test
    public void isPrime_2_Test() {
        testNumber = 2.;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %f", testNumber), true, actual);
    }

    @Test
    public void isPrime_3_Test() {
        testNumber = 3.;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %f", testNumber), true, actual);
    }

    @Test
    public void isPrime_4_Test() {
        testNumber = 4.;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %f", testNumber), false, actual);
    }

    @Test
    public void isPrime_5_Test() {
        testNumber = 5.;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %f", testNumber), true, actual);
    }

}