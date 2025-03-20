package btvn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class bt6 {
    static class countNumber {
        private int number;
        private int count;

        public countNumber(int number) {
            this.number = number;
            this.count = 1;
        }

        public int getNumber() {
            return number;
        }

        public int getCount() {
            return count;
        }

        @Override
        public String toString() {
            return number + "";
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<countNumber> list_check = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            boolean found = false;
            for (countNumber cn : list_check) {
                if (num == cn.getNumber()) {
                    cn.count++;
                    found = true;
                    break;
                }
            }
            if (!found) {
                list_check.add(new countNumber(num));
            }
        }
        for (int i = list_check.size() - 1; i >= 0; i--) {
            if (list_check.get(i).getCount() > 1) {
                list_check.remove(i);
            }
        }

        for (countNumber cn : list_check) {
            System.out.print(cn + " ");
        }
    }
}
