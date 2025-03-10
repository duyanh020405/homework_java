import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        StringBuilder ouput = new StringBuilder("Hello, Java World!");
        System.out.println(ouput);
        ouput.delete(5,9);
        System.out.println(ouput);
        ouput.replace(12,ouput.length(),"Universe");
        System.out.println(ouput);
    }
}
