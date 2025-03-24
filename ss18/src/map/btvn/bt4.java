package map.btvn;

import java.util.*;

public class bt4 {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        map.put("NV123", 1);
        map.put("NV234", 3);
        map.put("NV345", 7);
        map.put("NV456", 4);
        map.put("NV100", 2);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        LinkedHashMap<String, Integer> linkedMap = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : list) {
            linkedMap.put(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<String, Integer> entry : linkedMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("Nhap so luong muon thay doi cho NV123 :");
        int new_value = sc.nextInt();
        map.put("NV123", new_value);

        map.remove("NV234", new_value);
        System.out.println("Map  :"+map.toString());


    }
}
