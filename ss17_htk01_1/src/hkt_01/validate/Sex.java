package ss17_htk01_1.src.hkt_01.validate;

import java.util.Scanner;

public class Sex {
    boolean sex;

    public Sex(Scanner sc) {
        System.out.println("Nhap true-false (true la nam - false la nu)");
        setSex(sc.nextBoolean());
    }
    public void setSex(boolean sex) {
        if(sex == true){
            this.sex = true;
        }
        else{
            this.sex=false;
        }

    }
}
