package map.btvn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class bt8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(2, "II");
        map.put(3, "III");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(6, "VI");
        map.put(7, "VII");
        map.put(8, "VIII");
        map.put(9, "IX");
        map.put(10, "X");


        System.out.println("Nhap so N tu ban phim (tu 1-10)");
        int n = sc.nextInt();
        boolean flag = false;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey().equals(n)) {
                System.out.println(entry.getValue());
                flag = true;
            }
        }

        if (!flag) {
            System.out.println("Khong tim thay so do");
        }
    }
}
