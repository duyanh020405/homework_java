package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Map<Integer, String> StudentHashMap = new HashMap<>();
        StudentHashMap.put(1, "A");
        StudentHashMap.put(2, "B");
        StudentHashMap.put(3, "C");

        System.out.println("Thông tin của HashMap: " + StudentHashMap);

        // Lấy giá trị theo key
        System.out.println("Giá trị của key = 1: " + StudentHashMap.get(1));

        // Xóa phần tử có key = 2
        System.out.println("Xóa phần tử có key = 2: " + StudentHashMap.remove(2));

        // Kiểm tra sự tồn tại của key
        System.out.println("Có key = 1 hay không? -> " + StudentHashMap.containsKey(1));

        // Kiểm tra sự tồn tại của value
        System.out.println("Có value = 'A' hay không? -> " + StudentHashMap.containsValue("A"));

        // Lấy tập hợp các key từ HashMap
        Set<Integer> setKey = StudentHashMap.keySet();
        System.out.println("Danh sách key: " + setKey);

        // Duyệt qua các giá trị của HashMap
        for (String value : StudentHashMap.values()) {
            System.out.println("Giá trị: " + value);
        }
    }
}
