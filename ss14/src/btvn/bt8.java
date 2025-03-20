package btvn;

import java.util.ArrayList;
import java.util.Scanner;

public class bt8 {
    static class Arrange {
        public void arrangeList(ArrayList<String> list) {
            int n = list.size();
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    boolean swap = false;

                    if (list.get(i).length() > list.get(j).length()) {
                        swap = true;
                    }
                    else if (list.get(i).length() == list.get(j).length()
                            && list.get(i).compareTo(list.get(j)) > 0) {
                        swap = true;
                    }

                    if (swap) {
                        String temp = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, temp);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng chuỗi: ");
        int number = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < number; i++) {
            System.out.printf("Nhập chuỗi thứ %d: ", i + 1);
            arr.add(sc.nextLine());
        }

        System.out.println("Danh sách trước khi sắp xếp: " + arr);

        Arrange sorter = new Arrange();
        sorter.arrangeList(arr);

        System.out.println("Danh sách sau khi sắp xếp: " + arr);
        sc.close();
    }
}
