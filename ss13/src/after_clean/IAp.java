package after_clean;


import java.util.Scanner;

public interface IAp {
    double interest = 1.1; // Hằng số theo quy tắc của interface (public static final mặc định)
    void inputData(Scanner scanner);
    void display();
}
