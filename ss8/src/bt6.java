import java.util.Arrays;
import java.util.Scanner;

class string_obj {
    char value;
    int count = 0;
}

public class bt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        boolean run_2 = false;
        boolean run_3 = false;
        String text = "";
        int length;

        while (run) {
            System.out.println("===== Menu =====");
            System.out.println("1. Xử lí chuỗi");
            System.out.println("2. Xử lí số nguyên");
            System.out.println("3. Thoát chương trình");
            int choice = sc.nextInt();
            sc.nextLine(); // Fix lỗi trôi dòng

            if (choice == 1) {
                run_2 = true;
            } else if (choice == 2) {
                run_3 = true;
            } else if (choice == 3) {
                run = false;
            } else {
                System.out.println("Vui lòng chọn lại!");
            }

            while (run_2) {
                System.out.println("==== Menu =====");
                System.out.println("1. Nhập chuỗi");
                System.out.println("2. Loại bỏ khoảng trắng thừa trong chuỗi");
                System.out.println("3. Đếm số lần xuất hiện của từng kí tự");
                System.out.println("4. Chuyển đổi thành trạng thái chuẩn");
                System.out.println("5. Quay lại menu chính");

                int choice2 = sc.nextInt();
                sc.nextLine(); // Fix lỗi trôi dòng

                if (choice2 < 1 || choice2 > 5) {
                    System.out.println("Vui lòng chọn lại!");
                    continue;
                }

                switch (choice2) {
                    case 1:
                        System.out.println("Nhập chuỗi:");
                        text = sc.nextLine();
                        System.out.println("Chuỗi được nhập: " + text);
                        break;

                    case 2:
                        text = text.trim().replaceAll("\\s+", " ");
                        System.out.println("Chuỗi sau khi loại bỏ khoảng trắng thừa: " + text);
                        break;

                    case 3:
                        if (text.isEmpty()) {
                            System.out.println("Chuỗi trống. Vui lòng nhập chuỗi trước.");
                            break;
                        }

                        string_obj[] count_char = new string_obj[text.length()];
                        int size = 0;

                        for (int i = 0; i < text.length(); i++) {
                            char ch = text.charAt(i);
                            boolean found = false;

                            for (int j = 0; j < size; j++) {
                                if (count_char[j].value == ch) {
                                    count_char[j].count++;
                                    found = true;
                                    break;
                                }
                            }

                            if (!found) {
                                count_char[size] = new string_obj();
                                count_char[size].value = ch;
                                count_char[size].count = 1;
                                size++;
                            }
                        }

                        System.out.println("Ký tự - Số lần xuất hiện:");
                        for (int i = 0; i < size; i++) {
                            System.out.println(count_char[i].value + " - " + count_char[i].count);
                        }
                        break;

                    case 4:
                        String[] words = text.trim().split("\\s+");
                        StringBuilder formattedText = new StringBuilder();

                        for (String word : words) {
                            if (!word.isEmpty()) {
                                formattedText.append(Character.toUpperCase(word.charAt(0)))
                                        .append(word.substring(1).toLowerCase()).append(" ");
                            }
                        }

                        text = formattedText.toString().trim();
                        System.out.println("Chuỗi sau khi chuẩn hóa: " + text);
                        break;

                    case 5:
                        run_2 = false;
                        break;
                }
            }

            while (run_3) {
                System.out.println("===== MENU XỬ LÝ MẢNG SỐ NGUYÊN =====");
                System.out.println("1. Nhập mảng số nguyên");
                System.out.println("2. Tìm số nguyên tố lớn nhất trong mảng");
                System.out.println("3. Đếm số phần tử có chữ số đầu tiên là số lẻ");
                System.out.println("4. Kiểm tra mảng có phải là mảng đối xứng không");
                System.out.println("5. Quay lại menu chính");
                System.out.print("Chọn chức năng (1-5): ");

                int choice3 = sc.nextInt();

                if (choice3 < 1 || choice3 > 5) {
                    System.out.println("Vui lòng chọn lại!");
                    continue;
                }

                int[] arr = new int[0];

                switch (choice3) {
                    case 1:
                        System.out.print("Nhập số phần tử của mảng: ");
                        int n = sc.nextInt();
                        arr = new int[n];

                        System.out.println("Nhập các phần tử:");
                        for (int i = 0; i < n; i++) {
                            System.out.print("arr[" + i + "]: ");
                            arr[i] = sc.nextInt();
                        }
                        break;

                    case 2:
                        int maxPrime = -1;
                        for (int num : arr) {
                            if (kiemTraNguyenTo(num) && num > maxPrime) {
                                maxPrime = num;
                            }
                        }
                        System.out.println(maxPrime == -1 ? "Không có số nguyên tố trong mảng." : "Số nguyên tố lớn nhất: " + maxPrime);
                        break;

                    case 3:
                        int count = 0;
                        for (int num : arr) {
                            if (kiemTraChuSoDauLe(num)) {
                                count++;
                            }
                        }
                        System.out.println("Số phần tử có chữ số đầu tiên là số lẻ: " + count);
                        break;

                    case 4:
                        System.out.println(kiemTraMangDoiXung(arr) ? "Mảng là mảng đối xứng." : "Mảng không phải là mảng đối xứng.");
                        break;

                    case 5:
                        run_3 = false;
                        break;
                }
            }
        }
    }

    public static boolean kiemTraNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean kiemTraChuSoDauLe(int n) {
        if (n < 0) n = -n;
        while (n >= 10) {
            n /= 10;
        }
        return n % 2 == 1;
    }

    public static boolean kiemTraMangDoiXung(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] != arr[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}
