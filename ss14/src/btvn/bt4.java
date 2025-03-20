package btvn;

import java.util.ArrayList;
import java.util.Comparator;

public class bt4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(i) + " ");
        }
        list.sort(Integer::compareTo);
        System.out.println("\nMin trong mang :"  + list.get(0));
        System.out.println("Max trong mang :"  + list.get(list.size()-1));

    }
}
