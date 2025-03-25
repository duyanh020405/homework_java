package btvn.bt8;

import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers1 = List.of(5, -2, 10, 0, -7, 3);

        ListProcessor processor = new ListProcessorImpl();

        System.out.println("Danh sách: ");
        ListProcessor.printList(numbers1);
        System.out.println(processor.checkOdd(numbers1) ? "Danh sách chứa số lẻ" : "Danh sách không chứa số lẻ");
        System.out.println("Tổng các số : " + processor.sumOddNumbers(numbers1));



        scanner.close();
    }
}
