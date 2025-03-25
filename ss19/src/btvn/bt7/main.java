package btvn.bt7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        ListProcessor processor = new ListProcessorImpl();

        System.out.println("Nhập số lượng số:");
        int n = sc.nextInt();

        System.out.println("Nhập các số nguyên:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Danh sách số nguyên:");
        ListProcessor.printList(list);
        System.out.println(processor.containsNegative(list) ? "Danh sách chứa số âm" : "Danh sách không chứa số âm");

        sc.close();
    }
}
