package map.btvn;

import java.util.*;

public class bt7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;
        do {
            System.out.print("Nhập số phần tử N (N > 0): ");
            N = scanner.nextInt();
            if (N <= 0) {
                System.out.println("N phải là số nguyên dương! Vui lòng nhập lại.");
            }
        } while (N <= 0);

        int[] arr = new int[N];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());
        entryList.sort(Comparator.comparingInt(Map.Entry::getValue));
        System.out.println("Kết quả:");
        for (Map.Entry<Integer, Integer> entry : entryList) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        scanner.close();
    }
}
