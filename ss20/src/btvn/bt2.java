package btvn;

import java.util.ArrayList;
import java.util.List;

public class bt2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        int sum = numbers.stream().filter(s -> s % 2 != 0).reduce(0, Integer::sum);

        System.out.println("sum: " + sum);
    }
}
