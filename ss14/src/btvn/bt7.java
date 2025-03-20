package btvn;

import java.util.ArrayList;

public class bt7 {
    static class countNumber {
        private int number;
        int count;
        public countNumber(int number) {
            this.number = number;
            this.count = 1;
        }

        public int getCount() {
            return count;
        }
        public int getNumber() {
            return number;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<countNumber> test = new ArrayList<>();

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
            for (int j = 0; j < test.size(); j++) {
                if (num == test.get(j).getNumber()) {
                    test.get(j).count++;
                    found = true;
                    break;
                }

            }if(!found) {
                test.add(new countNumber(num));
            }
        }

        for (int i = 0; i < test.size(); i++) {
            if(test.get(i).getCount() > 1) {
                System.out.println(test.get(i).getNumber() + "-XUAT HIEN  "+test.get(i).getCount()+" LAN");
            }
            else {
                System.out.println(test.get(i).getNumber() + "-XUAT HIEN  "+test.get(i).getCount()+" LAN");
            }
        }



    }
}
