import java.util.Scanner;
public class bt10 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Nhập số phần tử của mảng n: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Mảng không hợp lệ");
                return;
            }

            int[] arr = new int[n];

            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            findMaxSubarray(arr);
        }

        public static void findMaxSubarray(int[] arr) {
            int maxSum = arr[0];
            int currentSum = arr[0];

            int start = 0, end = 0, tempStart = 0;

            for (int i = 1; i < arr.length; i++) {
                if (currentSum < 0) {
                    currentSum = arr[i];
                    tempStart = i;
                } else {
                    currentSum += arr[i];
                }

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    start = tempStart;
                    end = i;
                }
            }

            System.out.print("Tổng lớn nhất: " + maxSum + " (Dãy con [");
            for (int i = start; i <= end; i++) {
                System.out.print(arr[i]);
                if (i < end) System.out.print(", ");
            }
            System.out.println("])");
        }
    }
