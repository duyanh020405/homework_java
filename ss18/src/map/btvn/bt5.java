package map.btvn;

import java.util.*;

public class bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        map.put("A", 100);
        map.put("B", 2000);
        map.put("C", 300);
        map.put("D", 500);
        map.put("E", 1345);
        map.put("F", 1400);
        map.put("L", 600);
        map.put("G", 2000);

        List<Map.Entry<String, Integer>> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 500 && entry.getValue() <= 1500) {
                list.add(entry);
            }
        }

        list.sort(Map.Entry.comparingByValue());

        System.out.println("Danh sách sau khi lọc và sắp xếp:");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
