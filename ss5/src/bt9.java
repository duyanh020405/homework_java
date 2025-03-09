import java.util.Scanner;
import java.util.Random;
public class bt9 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random rand = new Random();

            System.out.print("Nhập kích thước ma trận n: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Ma trận không hợp lệ");
                return;
            }
            System.out.print("Bạn muốn nhập ma trận hay tạo ngẫu nhiên? (1 - Nhập, 2 - Ngẫu nhiên): ");
            int choice = sc.nextInt();

            int[][] matrix = new int[n][n];

            if (choice == 1) {
                System.out.println("Nhập ma trận:");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        matrix[i][j] = sc.nextInt();
                    }
                }
            } else {
                System.out.println("Ma trận ngẫu nhiên:");
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        matrix[i][j] = rand.nextInt(100); // Sinh số ngẫu nhiên từ 0-99
                    }
                }
            }

            System.out.println("Ma trận ban đầu:");
            printMatrix(matrix);


            rotateMatrix90(matrix);

            System.out.println("Ma trận sau khi xoay 90 độ:");
            printMatrix(matrix);
        }

        public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int val : row) {
                    System.out.print(val + "\t");
                }
                System.out.println();
            }
        }
        public static void rotateMatrix90(int[][] matrix) {
            int n = matrix.length;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0, k = n - 1; j < k; j++, k--) {
                    int temp = matrix[j][i];
                    matrix[j][i] = matrix[k][i];
                    matrix[k][i] = temp;
                }
            }
        }
    }

