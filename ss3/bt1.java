package ss3;
import java.util.Scanner;
public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int number1 = sc.nextInt();
        System.out.println("Enter the number 2: ");
        int number2 = sc.nextInt();
        System.out.println("Enter the number 3: ");
        int number3 =sc.nextInt();
        int max = number1;
        if(number1 == number2 && number2 == number3){
            System.out.println("3 so bang nhau");
            return;
        }
        else{

            if(number1 > number2){
                max = number1;
                return;
            }else{
                max = number2;
                if(number2 > number3){
                    max = number2;
                }
                else{
                    max = number3;
                }
            }
        }
        System.out.println("MAX : " + max);

    }
}

