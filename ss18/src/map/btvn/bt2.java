package map.btvn;

import java.util.HashMap;
import java.util.Map;

public class bt2 {
    public static void main(String[] args) {
        Map<String, Integer> laptops = new HashMap<>();
        laptops.put("Laptop", 100);
        laptops.put("B", 200);
        laptops.put("C", 80);
        laptops.put("D", 150);
        laptops.put("E", 200);
        laptops.put("F", 100);

        boolean flag = false;
        boolean flag2 = false;

        for (Map.Entry<String, Integer> entry : laptops.entrySet()) {
            if(entry.getKey().equals("Laptop")) {
                System.out.println(entry.getKey() + " " + entry.getValue());
                flag = true;
            }
            if(entry.getValue() > 100) {
                System.out.println(entry.getKey() + " " + entry.getValue());
                flag2 = true;
            }
        }

        if (!flag) {
            System.out.println("Khong co san pham Laptop");
        }
        if (!flag2) {
            System.out.println("Khong co san pham co gia tri tren 100");
        }
    }
}
