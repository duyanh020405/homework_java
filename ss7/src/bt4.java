import java.util.Scanner;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();
        StringBuilder output = new StringBuilder(text).reverse();
        System.out.println(output);
        System.out.println(text);
        if(text.equals(output.toString())) {
            System.out.println("Chuoi doi xung");
        }
        else {
            System.out.println("Chuoi khong doi xung");
        }

    }
}
