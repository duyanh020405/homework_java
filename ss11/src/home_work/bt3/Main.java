package home_work.bt3;

public class Main {
    public static void main(String[] args) {
        Bike newbike = new Bike("Xe dap thong nhat",100);
        Car newcar = new Car("Xe hn",100);
        newcar.start();
        newcar.displayinfor();
        newbike.start();
        newbike.displayinfor();

    }
}
