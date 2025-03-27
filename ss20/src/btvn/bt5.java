package btvn;

import java.util.Comparator;
import java.util.List;

public class bt5 {
    public static void main(String[] args) {
        List<Integer> normalList = List.of(10, 5, 8, 20, 7);
        List<Integer> singleElementList = List.of(10);
        List<Integer> allSameList= List.of(10, 10, 10);

        System.out.println("Mảng bình thường:");
        normalList.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .ifPresentOrElse(System.out::println,()-> System.out.println("Khong co so lon hon thu 2"));

        System.out.println("Mang singleElementList :");
        singleElementList.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                        .ifPresentOrElse(
                                System.out::println , ()-> System.out.println("Khong co so lon hon thu 2")
                        );

        System.out.println("Mang trung thanh phan :");
        allSameList.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .ifPresentOrElse(
                        System.out::println , ()-> System.out.println("Khong co so lon hon thu 2")
                );
    }


}
