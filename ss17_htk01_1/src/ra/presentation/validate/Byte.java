package ss17_htk01_1.src.ra.presentation.validate;

import java.util.Scanner;

public class Byte {
    byte status ;
    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        if ( status == 1 || status == 2 || status == 3 ) {
            this.status = status;
        }
        else {
            System.err.println("Status khong dung");

        }
    }

    public Byte (Scanner sc) {
        System.out.println("Nhap byte 1-2-3 (1-Dang hoc , 2-Bao luu  , 3- Nghi hoc):");
        setStatus(sc.nextByte());
    }
}
