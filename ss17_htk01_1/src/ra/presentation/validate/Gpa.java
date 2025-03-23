package ss17_htk01_1.src.ra.presentation.validate;

import java.util.Scanner;

public class Gpa {
    float gpa ;

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        if (gpa >=0 || gpa <10) {
            this.gpa = gpa;
        }
        else {
            System.err.println("Gpa khong dung");
        }

    }

    public Gpa(Scanner sc) {
        System.out.println("Nhap gpa :");
        setGpa(sc.nextFloat());

    }
}
