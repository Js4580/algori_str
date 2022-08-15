package Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
//        System.out.println(fibonacciNaive(100));
        System.out.println(fibonacciEffective(5));
    }

    private static long fibonacciNaive(int n) {
        if (n <= 1) return n;
        return fibonacciNaive(n - 1) + fibonacciNaive(n - 2);
    }

    private static double fibonacciEffective(int n) {
        double[] fibonacci = new double[n +1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int index = 2; index <= n; index++) fibonacci[index] = fibonacci[index - 1] + fibonacci[index - 2];
        return fibonacci[n];
    }
}
