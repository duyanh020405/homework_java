import java.util.Scanner;

public class bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text");
        String text = sc.nextLine();
        StringBuilder output = new StringBuilder(text);
        output.reverse();

        System.out.println("Chuoi ban dau");
        System.out.println(text);
        System.out.println("Chuoi sau khi dao nguoc");
        System.out.println(output);
    }
}
