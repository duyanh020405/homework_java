import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class bt9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập url");
        String url = sc.nextLine();
        ArrayList<String> all_arr = new ArrayList<>();
        String[] arr = url.split("://");
        all_arr.add(arr[0]);
        String[] arr2 = arr[1].split("/",2);
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i].equals("invalid-url")) {
                arr2[i] = "invalid-url";
            }
            all_arr.add(arr2[i]);
        }
        System.out.println("Giao thức : "+all_arr.get(0));
        System.out.println("Tên miền :"+all_arr.get(1));
        System.out.println("Đường dẫn : /"+all_arr.get(2));
    }
}
