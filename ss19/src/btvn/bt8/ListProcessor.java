package btvn.bt8;

import java.util.List;
import java.util.function.Predicate;

interface ListProcessor {

    static void printList(List<Integer> list) {
        list.forEach(System.out::println);
    }

    double sumOddNumbers(List<Integer> list);

    default boolean checkOdd(List<Integer> list) {
        Predicate<Integer> isOdd = num -> num % 2 != 0;
        return list.stream().anyMatch(isOdd);
    }
}
