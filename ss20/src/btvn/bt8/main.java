package btvn.bt8;

import java.util.*;
import java.util.stream.Collectors;


public class main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Quý", "IT", 8.5),
                new Student("Lan", "Business", 7.2),
                new Student("Minh", "IT", 9.0),
                new Student("Huyền", "Design", 6.8),
                new Student("Long", "IT", 7.9),
                new Student("Trang", "Business", 8.1),
                new Student("Việt", "IT", 8.0),
                new Student("Tú", "Design", 7.5),
                new Student("Phúc", "Business", 6.9),
                new Student("An", "AI", 9.5)
        );

        Map<String, Long> infor = students.stream()
                .collect(Collectors.groupingBy(Student::getMajor, Collectors.counting()));

        List<Map.Entry<String, Long>> sortedList = new ArrayList<>(infor.entrySet());
       sortedList.sort((o1,o2)->(o2.getValue().compareTo(o1.getValue())));
        sortedList.forEach(o-> System.out.println(o.getKey()+" "+o.getValue()));



    }
}
