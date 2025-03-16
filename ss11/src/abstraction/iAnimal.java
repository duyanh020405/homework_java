package abstraction;

import java.util.Scanner;

public interface iAnimal {
    // public static final
    String NAME = "Animal";
    int AGE = 2;
    //Cac phuong thuc
    public abstract void inputData(Scanner scanner);
    void displayData();
}
