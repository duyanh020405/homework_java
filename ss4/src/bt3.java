import java.util.Scanner;
public class bt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 1 ; i <= 10 ; i++){
            for(int j = 0 ; j <= 10; j++){
                System.out.println(i + "*" + j + " = " + i*j);
            }
        }
    }
}
