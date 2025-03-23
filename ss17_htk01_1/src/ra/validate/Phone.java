package ss17_htk01_1.src.ra.validate;

import java.util.Scanner;

public class Phone {
    String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Phone(Scanner sc) {
        System.out.println("Nhap so dien thoai");
        String number = sc.nextLine();
        if(isValidPhone(number)) {
            this.number = number;
        }
        else {
            this.number = null;
        }


    }
    private boolean isValidPhone(String phone) {
       if (phone.charAt(0) == '0' && (phone.length() == 10 || phone.length() == 11)) {
           for (int i = 1; i < phone.length()-1; i++) {
               if (!Character.isDigit(phone.charAt(i))) {
                   return false;
               }
               else{
                   return true;
               }
           }
       }
        return true;
    }
}
