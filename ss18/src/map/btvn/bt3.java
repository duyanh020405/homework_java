package map.btvn;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
        map.put("E",5);
        System.out.println("LinkedMap theo thu tu :"+map.toString());
        System.out.println("Nhap gia tri Key :");
        String key = sc.nextLine();
        for(Map.Entry<String,Integer> entry : map.entrySet()) {
            if(entry.getKey().equals(key)) {
                System.out.println("Nhap value muon thay doi thanh");
                int new_value = entry.getValue();
                map.put(key, new_value);
                System.out.println("LinkedMap  :"+map.toString());
            }
        }

        map.remove("A");
        System.out.println("LinkedMap  :"+map.toString());

    }
}
