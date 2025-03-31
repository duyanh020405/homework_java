package bt3;

public class main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        SharedResource sharedResource2 = new SharedResource();
        System.out.println("Luong 1 :");
        sharedResource.printAlphabet();
        System.out.println("\nLuong 2 :");
        sharedResource2.printAlphabet();
    }
}
