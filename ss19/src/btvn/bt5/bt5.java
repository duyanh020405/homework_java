package btvn.bt5;

import java.util.Formattable;
import java.util.Scanner;

public class bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so luong chuoi");
        int n = sc.nextInt();
        String[] str = new String[n];
        int sum = 0 ;
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap chuoi thu "+(i+1)+":");
            if(sc.nextLine().startsWith("A") && sc.nextLine().length() > 5){
                str[i] = sc.nextLine();
                sum ++;
            }
        }
        System.out.println("Output: "+sum);

    }
}
