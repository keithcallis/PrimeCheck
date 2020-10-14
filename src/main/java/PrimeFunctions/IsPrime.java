package PrimeFunctions;

public class IsPrime {
    public boolean IsPrime(Double numberIn) {

        if (numberIn <= 1) return false;
        if (numberIn == 2) return true;
        if ((numberIn % 2) == 0) return false;
        double squareRoot = Math.sqrt(numberIn);
        long sqrt = Math.round(squareRoot);

        if (squareRoot == sqrt) {
            return false;
        }

        for (long i = 3; i <= sqrt; i=i+2) {
            Double mod = numberIn % i;
            if (mod == 0) {
                return false;
            }
        }

        return true;
    }
}
