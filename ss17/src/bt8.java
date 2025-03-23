package ss17.src;

import java.util.*;

public class bt8 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 4, 3, 8, 3};
        int k = 10;

        Set<String> uniquePairs = new HashSet<>();
        List<int[]> pairsList = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == k) {
                    int a = Math.min(numbers[i], numbers[j]);
                    int b = Math.max(numbers[i], numbers[j]);
                    String pairKey = a + "," + b;

                    if (!uniquePairs.contains(pairKey)) {
                        uniquePairs.add(pairKey);
                        pairsList.add(new int[]{a, b});
                    }
                }
            }
        }

        pairsList.sort(Comparator.comparingInt(arr -> arr[0]));

        System.out.print("Các cặp số có tổng bằng " + k + ": ");
        for (int[] pair : pairsList) {
            System.out.print("(" + pair[0] + ", " + pair[1] + ") ");
        }
    }
}
