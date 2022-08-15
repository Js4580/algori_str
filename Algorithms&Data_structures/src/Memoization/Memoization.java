
package Memoization;
import java.util.Arrays;

public class Memoization {
    public static void main(String[] args) {
        int variable_fibonacci = 100;
        long[] memoization = new long[variable_fibonacci + 1];

        Arrays.fill(memoization, -1);

        System.out.println(fibonacciNaive(variable_fibonacci, memoization));
    }

    private static long fibonacciNaive(int variable, long[] memoization) {
        if (memoization[variable] != -1) return memoization[variable];
        if (variable <= 1) return variable;
        long result = fibonacciNaive(variable - 1, memoization) + fibonacciNaive(variable - 2, memoization);
        memoization[variable] = result;
        return result;
    }
}
