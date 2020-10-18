package PrimeFunctions;

import org.junit.Assert;
import org.junit.Test;

public class IsPrimeTest {

    IsPrime funcPrime = new IsPrime();
    Long testNumber = 9223372036854775807l;

    @Test
    public void isPrime_49_Test() {
        testNumber = 49l;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), false, actual);
    }

    @Test
    public void isPrime_37_Test() {
        testNumber = 37l;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), true, actual);
    }

    @Test
    public void isPrime_440101_Test() {
        testNumber = 440101l;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), true, actual);
    }

    @Test
    public void isPrime_5600748293801_Test() {
        Long testNumber =  5600748293801l;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), true, actual);
    }

    @Test
    public void isPrime_99194853094755497_Test() {
        Long testNumber =  99194853094755497l;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), true, actual);
    }

    @Test
    public void isPrime_9223372036854775807_Test() {
        Long testNumber = (long) 9223372036854775783l;
        boolean actual =  this.funcPrime.IsPrime(testNumber);

        Assert.assertEquals(String.format("correct for %d", testNumber), true, actual);

    }


    @Test
    public void isPrime_4611686018427387631_Test() {
//        Long testNumber = Long.valueOf((long) (pow(2d,62d) - 1));
        Long testNumber = Long.valueOf("4611686018427387631");
        boolean actual = actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), true, actual);

    }

    @Test
    public void isPrime_982451653_Test() {
        testNumber = 982451653l;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), true, actual);
    }

    @Test
    public void isPrime_179426029_Test() {
        testNumber = 179426029l;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), true, actual);
    }

    @Test
    public void isPrime_neg83_Test() {
        testNumber = Long.valueOf(-83);
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), false, actual);
    }

    @Test
    public void isPrime_1_Test() {
        testNumber = 1l;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), false, actual);
    }

    @Test
    public void isPrime_2_Test() {
        testNumber = 2l;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), true, actual);
    }

    @Test
    public void isPrime_3_Test() {
        testNumber = 3l;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), true, actual);
    }

    @Test
    public void isPrime_4_Test() {
        testNumber = 4l;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), false, actual);
    }

    @Test
    public void isPrime_5_Test() {
        testNumber = 5l;
        boolean actual = this.funcPrime.IsPrime(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), true, actual);
    }

}