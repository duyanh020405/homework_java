package ss3;

import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score from 3 subject :");
        int score = sc.nextInt();
        int score2 = sc.nextInt();
        int score3 = sc.nextInt();
        if(score >=0 && score <=10 && score2 >= 0 && score3 >= 0 && score2 <= 10 && score3 <= 10){
            int total = (score+score2+score3)/3;
            if(total <5){
                System.out.println("Yeu");
            }
            else if(total < 6.5){
                System.out.println("TB");
            }
            else if(total < 7.5){
                System.out.println("Kha");
            }
            else{
                System.out.println("Gioi");
            }
        }
        else{
            System.out.println("So khong hop le , vui long thu lai");
        }

    }
}
