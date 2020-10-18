import PrimeFunctions.*;

public class CheckPrime {
    public static void main (String[] args) {
        Long numberIn = Long.parseLong(args[0]);
        IsPrime isPrime = new IsPrime();
        boolean primeNumber = isPrime.IsPrime(numberIn);

        System.out.printf("Number %d is prime %s%n", numberIn, primeNumber);
    }

}
