package map.btvn;

import java.util.*;

public class bt6 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedMapStudents = new LinkedHashMap<>();
        linkedMapStudents.put("A",1);
        linkedMapStudents.put("B",2);
        linkedMapStudents.put("D",4);
        linkedMapStudents.put("F",6);
        linkedMapStudents.put("C",3);
        linkedMapStudents.put("E",5);
        linkedMapStudents.put("G",7);
        linkedMapStudents.put("H",8);
        linkedMapStudents.put("I",9);
        linkedMapStudents.put("J",10);

        for(String s : linkedMapStudents.keySet()) {
            System.out.println(s + " : " + linkedMapStudents.get(s));
        }
        float sum = 0 ;
        for(Integer v : linkedMapStudents.values()) {
            sum += v.floatValue();
        }
        sum = sum / linkedMapStudents.size();
        System.out.println("Tong diem trung binh cac hoc sinh :"+sum);


        Map<String, Integer> map = new LinkedHashMap<>(linkedMapStudents);
        LinkedHashMap<String, Integer> linkedMap = new LinkedHashMap<>();

        List<String> keysToRemove = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < 5) {
                keysToRemove.add(entry.getKey());
            } else {
                linkedMap.put(entry.getKey(), entry.getValue());
            }
        }

        for (String key : keysToRemove) {
            map.remove(key);
        }

        linkedMapStudents = linkedMap;

        System.out.println("Mảng sau khi bị xóa: " + linkedMapStudents);

    }
}
