package btvn;

import java.util.ArrayList;
import java.util.List;

public class bt5 {
    static class CountNumber {
        private int number;
        private int count;

        public CountNumber(int number) {
            this.number = number;
            this.count = 1;
        }


        public String display() {
            return number + " xuất hiện " + count + " lần";
        }

        public int getNumber() {
            return number;
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<CountNumber> list_count = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.add(1);
        list.add(2);
        list.add(3);

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            boolean found = false;
            for (int j = 0; j < list_count.size(); j++) {
                if (list_count.get(j).getNumber() == num) {
                    list_count.get(j).count++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                list_count.add(new CountNumber(num));
            }
        }

        for (CountNumber cn : list_count) {
            System.out.println(cn.display());
        }
    }
}
