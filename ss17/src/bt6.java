package ss17.src;

import java.util.HashSet;
import java.util.Scanner;

public class bt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> numbers = new HashSet<Integer>();
        HashSet<Integer> numbers2 = new HashSet<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers2.add(4);
        numbers2.add(5);
        numbers2.add(6);
        numbers2.add(7);
        numbers2.add(8);
        numbers2.retainAll(numbers);
        System.out.println(numbers2);
    }
}
