package btvn;

import java.util.ArrayList;

public class bt2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println("List trước khi xóa:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 3 == 0) {
                list.remove(i);
            }
        }
        System.out.println("List sau khi xóa:");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
