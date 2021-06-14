package PrimeFunctions;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class IsPrimeBigIntegerTest {

    IsPrime funcPrime = new IsPrime();
    BigInteger testNumber = BigInteger.valueOf(9223372036854775807L);

    @Test
    public void isPrimeBigInteger_49_Test() {
        testNumber = new BigInteger("49");
        boolean actual = this.funcPrime.IsPrimeBigInteger(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), false, actual);
    }

    @Test
    public void isPrimeBigInteger_37_Test() {
        testNumber = new BigInteger("37");
        boolean actual = this.funcPrime.IsPrimeBigInteger(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), true, actual);
    }

    @Test
    public void isPrimeBigInteger_440101_Test() {
        testNumber = new BigInteger("440101");
        boolean actual = this.funcPrime.IsPrimeBigInteger(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), true, actual);
    }

    @Test
    public void isPrimeBigInteger_2932031007403_Test() {
        testNumber = new BigInteger("2932031007403");
        boolean actual = this.funcPrime.IsPrimeBigInteger(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), true, actual);
    }

    @Test
    public void isPrimeBigInteger_10052678938039_Test() {
        testNumber = new BigInteger("10052678938039");
        boolean actual = this.funcPrime.IsPrimeBigInteger(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), true, actual);
    }

    @Test
    public void isPrimeBigInteger_96076791871613611_Test() {
        testNumber = new BigInteger("96076791871613611");
        boolean actual = this.funcPrime.IsPrimeBigInteger(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), true, actual);
    }

    @Test
    public void isPrimeBigInteger_5600748293801_Test() {
        testNumber = new BigInteger("5600748293801");
        boolean actual = this.funcPrime.IsPrimeBigInteger(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), true, actual);
    }

    @Test
    public void isPrimeBigInteger_99194853094755497_Test() {
        testNumber = new BigInteger("99194853094755497");
        boolean actual = this.funcPrime.IsPrimeBigInteger(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), true, actual);
    }

/*
    @Test
    public void isPrimeBigInteger_9223372036854775807_Test() {
        testNumber = new BigInteger("9223372036854775783");
        boolean actual =  this.funcPrime.IsPrimeBigInteger(testNumber);
        Assert.assertEquals(String.format("correct for %d", testNumber), true, actual);
    }
*/


    @Test
    public void isPrimeBigInteger_4611686018427387631_Test() {
//        Long testNumber = Long.valueOf((long) (pow(2d,62d) - 1));
        testNumber = new BigInteger("4611686018427387631");
        boolean actual = actual = this.funcPrime.IsPrimeBigInteger(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), true, actual);

    }

    @Test
    public void isPrimeBigInteger_982451653_Test() {
        testNumber = new BigInteger("982451653");
        boolean actual = this.funcPrime.IsPrimeBigInteger(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), true, actual);
    }

    @Test
    public void isPrimeBigInteger_179426029_Test() {
        testNumber = new BigInteger("179426029");
        boolean actual = this.funcPrime.IsPrimeBigInteger(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), true, actual);
    }

    @Test
    public void isPrimeBigInteger_neg83_Test() {
        testNumber = new BigInteger("-83");
        boolean actual = this.funcPrime.IsPrimeBigInteger(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), false, actual);
    }

    @Test
    public void isPrimeBigInteger_1_Test() {
        testNumber = new BigInteger("1");
        boolean actual = this.funcPrime.IsPrimeBigInteger(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), false, actual);
    }

    @Test
    public void isPrimeBigInteger_2_Test() {
        testNumber = new BigInteger("2");
        boolean actual = this.funcPrime.IsPrimeBigInteger(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), true, actual);
    }

    @Test
    public void isPrimeBigInteger_3_Test() {
        testNumber = new BigInteger("3");
        boolean actual = this.funcPrime.IsPrimeBigInteger(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), true, actual);
    }

    @Test
    public void isPrimeBigInteger_4_Test() {
        testNumber = new BigInteger("4");
        boolean actual = this.funcPrime.IsPrimeBigInteger(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), false, actual);
    }

    @Test
    public void isPrimeBigInteger_9_Test() {
        testNumber = new BigInteger("9");
        boolean actual = this.funcPrime.IsPrimeBigInteger(testNumber);
        Assert.assertEquals(String.format("not correct for %d", testNumber), false, actual);
    }

}