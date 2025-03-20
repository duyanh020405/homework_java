package btvn;

import java.util.ArrayList;

public class bt3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0 ;
        for (int i = 0; i < 10; i++) {
            list.add(i);
            sum += i;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(i) +" ");
        }
        System.out.println("- Tong cac so : "+sum);
    }


}
