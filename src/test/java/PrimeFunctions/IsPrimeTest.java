package PrimeFunctions;

import org.junit.Assert;
import org.junit.Test;

public class IsPrimeTest {

    IsPrime funcPrime = new IsPrime();

    @Test
    public void isPrime_49_Test() {
        int testNumber = 49;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), false, actual);
    }

    @Test
    public void isPrime_37_Test() {
        int testNumber = 37;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), true, actual);
    }

    @Test
    public void isPrime_440101_Test() {
        int testNumber = 440101;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), true, actual);
    }

    @Test
    public void isPrime_982451653_Test() {
        int testNumber = 982451653;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), true, actual);
    }

    @Test
    public void isPrime_179426029_Test() {
        int testNumber = 179426029;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), true, actual);
    }

    @Test
    public void isPrime_neg83_Test() {
        int testNumber = -83;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), false, actual);
    }

    @Test
    public void isPrime_1_Test() {
        int testNumber = 1;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber),false, actual);
    }

    @Test
    public void isPrime_2_Test() {
        int testNumber = 2;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber),true, actual);
    }

    @Test
    public void isPrime_3_Test() {
        int testNumber = 3;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber),true, actual);
    }

    @Test
    public void isPrime_4_Test() {
        int testNumber = 4;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber),false, actual);
    }

    @Test
    public void isPrime_5_Test() {
        int testNumber = 5;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber),true, actual);
    }

}