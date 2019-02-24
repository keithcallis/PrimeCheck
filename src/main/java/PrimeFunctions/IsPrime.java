package PrimeFunctions;

public class IsPrime {
    public boolean IsPrime(int numberIn) {

        if (numberIn <= 1) return false;
        if (numberIn == 2) return true;
        if ((numberIn % 2) == 0) return false;
        int sqrt = (int) Math.sqrt(numberIn);

        for (int i = 3; i <= sqrt; i=i+2) {
            int mod = numberIn % i;
            if (mod == 0) {
                return false;
            }
        }

        return true;
    }
}
