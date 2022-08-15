package Binary_search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] search = {23, -12, 42, 5, -100};
        int key = 42;
        int result = binarySearch(search, key);
        System.out.println(result);
        int wp = b_search(search,5,0,4);
        System.out.println(wp);
    }

    private static int binarySearch(int[] search, int key) {
        Arrays.sort(search);
        int low = 0;
        int high = search.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (key < search[middle]) high = middle - 1;
            else if (key > search[middle]) low = middle + 1;
            else return middle;
        }
        return -1;
    }

    private static int b_search(int[] search, int key, int low, int high) {
        int middle = low + (high - low) / 2;
        if (!(low <= high)) return -1;
        if (key < search[middle]) return b_search(search, key, low, middle - 1);
        else if (key == search[middle]) return middle;
        else return b_search(search, key, middle + 1, high);
    }
}

