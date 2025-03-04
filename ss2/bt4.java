package ss2;

public class bt4 {
    boolean a = true ;
    boolean b = false ;
    boolean c = false ;
    public void check (){
        if(a && b == true){
            System.out.println("Ca a va b deu dung");
        }
        else if(a == true || b == true){
            System.out.println("Co it nhat 1 dung");

        }
        else if(b == true || a == false ){
            System.out.println("Khong dung");
        };

        if(c == false){
            c = true;
            System.out.println("C false => true");
        }
        else{
            c = false;
            System.out.println("C true => false");
        }
    }
    public static void main(String[] args) {
        bt4 obj = new bt4();
        obj.check();
    }
}

