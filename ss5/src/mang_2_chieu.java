import java.util.Scanner;

public class mang_2_chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng mảng 2 chiều");
        int n = Integer.parseInt(sc.nextLine()) ;
        System.out.println("Nhập số cot mảng 2 chiều");
        int m = Integer.parseInt(sc.nextLine());
        int[][] numbers = new int[n][m];
        do{
            System.out.println("*******Menu********");
            System.out.println("1.Nhập các giá trị phần tử");
            System.out.println("2.Hiển thị theo ma trận");
            System.out.println("3.Kiểm tra sự tồn tại của 1 giá trị");
            System.out.println("4.Thoát");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.printf("Nhấp số của [%d, %d] : ", (i+1),(i+1));
                            numbers[i][j] = sc.nextInt();
                        }
                        System.out.println("\n");
                    }
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.println(numbers[i][j]);
                        }
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    for (int i = 0; i < numbers.length; i++) {
                        for (int j = 0; j < numbers[i].length; j++) {
                            System.out.printf("%3d",numbers[i][j]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Nhập số n để tìm :");
                    int find = sc.nextInt();
                    int count = 0;
                    for (int i = 0; i < numbers.length; i++) {
                        for (int j = 0; j < numbers[i].length; j++) {
                            if (numbers[i][j] == find) {
                                count++;
                            }
                        }
                    }
                    if(count >0){
                        System.out.println("Có giá trị đó");
                    }
                    else{
                        System.out.println("Không có giá trị");
                    }

            }
        }while (true);


    }
}
