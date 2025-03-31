package bt3;

public class SharedResource extends Thread {
    void printAlphabet(){
        for(int i = 'A'; i <= 'Z'; i++){
            System.out.print((char)i+" ");
        }
    }
}
