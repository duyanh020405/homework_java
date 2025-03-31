package util;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 chuoi ky tu de kiem tra !!");
        String input = sc.nextLine();

//        Validator.ValidatorInt(input.trim());
//        Validator.ValidatorFloat(input.trim());
//        Validator.ValidatorDouble(input.trim());
        Validator.ValidatorBoolean(input.trim());
//        Validator.ValidatorString(input.trim());
//        Validator.Validatorphone(input.trim());
//        Validator.ValidatorEmail(input.trim());

    }
}
