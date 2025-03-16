package abstraction;

public class Demo {
    public static void main(String[] args) {
        //Khoi tao persion
        Persion persion = new Persion() {
            @Override
            public int addTwoNumber(int firstNumber, int secondNumber) {
                return 0;
            }

            @Override
            public void hello() {

            }
        };
    }
}
