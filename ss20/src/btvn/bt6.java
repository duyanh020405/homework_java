package btvn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class bt6 {
    public static void main(String[] args) {
        List<String> items = List.of("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String, Long> map = items.stream().
                                    collect(Collectors.groupingBy(i->i ,Collectors.counting()));
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "xuat hien : " + entry.getValue());
        }
    }
}
