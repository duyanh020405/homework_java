package ss3;

import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        if(number == 0){
            System.out.println("So nay khong phai chan cung khong phai le");
        }
        else{
            if(number % 2 == 0){
                System.out.println("So le");
                return;
            }
            else{
                System.out.println("So chan");
                return;
            }
        }
    }
}
