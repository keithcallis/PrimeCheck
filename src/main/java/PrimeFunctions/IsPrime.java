package PrimeFunctions;

import java.math.BigInteger;

public class IsPrime {

    BigInteger bigInteger2 = new BigInteger("2");
    BigInteger bigInteger3 = new BigInteger("3");

    public boolean IsPrime(Long numberIn) {

        if (numberIn <= 1) return false;
        if (numberIn == 2) return true;
        if ((numberIn % 2) == 0) return false;
        double squareRoot = Math.sqrt(numberIn);
        Long sqrt = Math.round(squareRoot);

        if (squareRoot == sqrt) {
            return false;
        }

        for (long i = 3; i <= sqrt; i=i+2) {
            Long mod = numberIn % i;
            if (mod == 0) {
                return false;
            }
        }

        return true;
    }

    public boolean IsPrimeBigInteger(BigInteger numberIn) {

        if (numberIn.compareTo(new BigInteger("1")) <= 0) return false;
        if (numberIn.compareTo(new BigInteger("2")) == 0) return true;
        BigInteger[] evenDivision = numberIn.divideAndRemainder(bigInteger2);
        if (evenDivision[1] == BigInteger.ZERO) return false;
        BigInteger[] squareRoot = numberIn.sqrtAndRemainder();
        BigInteger sqrt = squareRoot[0];
        if (squareRoot[1].compareTo(BigInteger.ZERO) != 0) sqrt = sqrt.add(BigInteger.ONE);

        if (squareRoot[0].compareTo(sqrt) == 0) {
            return false;
        }

//        System.out.printf("square root: %s%n", sqrt.toString());
//        BigInteger[] loopCheck;
        for (BigInteger i = bigInteger3; i.compareTo(sqrt) <= 0; i = i.add(bigInteger2)) {

//            loopCheck = i.divideAndRemainder(new BigInteger("100000001"));
//            if (loopCheck[1].compareTo(BigInteger.ZERO) == 0) {
//                System.out.printf("%s looping: %s%n", LocalDateTime.now().toString() , i.toString());
//            }

            BigInteger[] mod = numberIn.divideAndRemainder(i);
            if (mod[1].compareTo(BigInteger.ZERO) == 0) {
                return false;
            }
        }

        return true;
    }
}
