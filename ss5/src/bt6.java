import java.util.Arrays;

public class bt6 {
    public static void main(String[] args) {
        int[] markingArray = new int[1000];
        int[] originalArray = {45, 23, 234, 45, 678, 23, 890, 100, 45, 234,
                876, 45, 23, 234, 567, 890, 234, 23, 45, 567};
        for (int num : originalArray) {
            markingArray[num - 1]++;
        }
        int maxCount = 0;
        for (int count : markingArray) {
            if (count > maxCount) {
                maxCount = count;
            }
        }
        System.out.println("Các phần tử xuất hiện nhiều nhất:");
        for (int i = 0; i < markingArray.length; i++) {
            if (markingArray[i] == maxCount) {
                System.out.println("Phần tử: " + (i + 1) + " - Số lần xuất hiện: " + maxCount);
            }
        }
    }
}
