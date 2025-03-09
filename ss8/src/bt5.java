import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        boolean run = true;
        int[] arr = new int[n];
        while (run) {
        System.out.println("***************** Menu****************** ");
        System.out.println("1. Nhập giá trị N vào phần tử của mảng :");
        System.out.println("2. In ra các phần tử trong mảng");
        System.out.println("3. Tính trung bình các phần tử dương trong mảng");
        System.out.println("4. Nhập k và tìm kiếm vị trí xem có số nào = k không");
        System.out.println("5. Tính số lượng là các số nguyên tố trong mảng");
        System.out.println("6. Exit");
        System.out.println("**************** Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
                case 1:
                    System.out.println("Nhập số phần tử của mảng");
                    int input = sc.nextInt();
                    if (input <= 0) {
                        System.out.println("Nhập không hợp lệ , vui lòng thử lại");
                    } else {
                        n = input;
                        arr = new int[n];
                        for (int i = 0; i < n; i++) {
                            System.out.println("Nhậ số thứ :" + (i + 1));
                            arr[i] = sc.nextInt();
                        }
                    }
                    break;

                case 2:
                    if (n == 0) {
                        System.out.println("Số phần tử chưa được nhập , vui lòng nhập số lượng");
                        break;
                    } else {
                        for (int i = 0; i < n; i++) {
                            System.out.println(arr[i] + " ");
                        }
                    }

                    break;
                case 3:
                    if (n == 0) {
                        System.out.println("Số phần tử chưa được nhập , vui lòng nhập số lượng");
                        break;
                    } else {
                        int sum = 0;
                        for (int i = 0; i < n; i++) {
                            if (arr[i] > 0) {
                                sum += arr[i];
                            }

                        }
                        System.out.println("Sum :" + sum);
                    }
                    break;
                case 4:
                    boolean check = false;
                    if (n == 0) {
                        System.out.println("Số phần tử chưa được nhập , vui lòng nhập số lượng");
                        break;
                    } else {
                        System.out.println("Nhập k :");
                        int find = sc.nextInt();
                        for (int i = 0; i < n; i++) {
                            if (arr[i] == find) {
                                find = i + 1;
                                check = true;
                            }
                        }
                        if (check) {
                            System.out.println("k = số thử " + find + " trong mảng");
                            break;
                        } else {
                            System.out.println("k không bằng số nào trong mảng cả");
                        }
                    }
                    break;
                case 5:
                    int count_number = 0;
                    for (int i = 0; i < n; i++) {
                        int count = 0 ;
                        for (int j = i + 1; j <= arr[i]; j++) {
                            if(arr[i] % j == 0) {
                                count++;
                                if(count == 2) {
                                    count_number++;
                                }
                            }

                        }
                    }
                    System.out.println("Các số nguyên tố có số lượng :" + count_number);
                    break;
                case 6:
                    run = false;
                    break;
            }
        }
    }
}
