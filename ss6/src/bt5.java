import java.util.Scanner;
import java.util.WeakHashMap;

public class bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        String input = sc.nextLine();
        String[] words = input.split(" ");
        String[] ouput ;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (!Character.isLetterOrDigit(ch)) {
                    System.out.println(word);
                }
            }
        }
    }
}