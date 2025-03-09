import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi :");
        String input =sc.nextLine();
        System.out.println("Nhập tìm kiếm ");
        String find = sc.nextLine();
        int index = input.indexOf(find);
        if (input.contains(find)) {
            System.out.printf("Có xuất hiện tại vị trí %d trong chuỗi", index);
        }
        else {
            System.out.println("Không xuất hiện ");
        }
    }
}
