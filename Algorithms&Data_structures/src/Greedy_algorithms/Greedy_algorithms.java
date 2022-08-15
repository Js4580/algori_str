package Greedy_algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.sort;

public class Greedy_algorithms {
    public static void main(String[] args) {
        int[] digits = new int[]{1, 3, 7, 9, 9, 5};
        String yep = maxNumberFromDigits(digits);
        System.out.println(yep);
    }

    private static String maxNumberFromDigits(int[] digits) {
        return String.join("",Arrays.stream(digits).boxed().sorted(Comparator.reverseOrder()).map(String::valueOf).toArray(String[]::new));
        /*Arrays.sort(digits);
        String result = "";
        for (int i = digits.length - 1; i >= 0; i--) result += digits[i];
        return result;*/
    }
}
