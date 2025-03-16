public class bt10 {
    static abstract class PaymentMethod {
        double amount;

        PaymentMethod(double amount) {
            this.amount = amount;
        }

        abstract double processPayment();
        abstract double calculateFee();

        public void processPayment(double amount, String currency){
            this.amount = amount;
        }

        String processPayment(String currency) {
            return processPayment() + " " + currency;
        }
    }

    static class CreditCard extends PaymentMethod {
        CreditCard(double amount) { super(amount); }

        @Override
        double processPayment() {
            return amount + calculateFee();
        }

        @Override
        double calculateFee() {
            return amount * 0.02;
        }
    }

    static class DebitCard extends PaymentMethod {
        DebitCard(double amount) { super(amount); }

        @Override
        double processPayment() {
            return amount + calculateFee();
        }

        @Override
        double calculateFee() {
            return amount * 0.01;
        }
    }

    static class Cash extends PaymentMethod {
        Cash(double amount) { super(amount); }

        @Override
        double processPayment() {
            return amount;
        }

        @Override
        double calculateFee() {
            return 0;
        }
    }

    public static void main(String[] args) {
        PaymentMethod[] payments = {new CreditCard(1000), new DebitCard(1000), new Cash(1000)};
        String[] currencies = {"USD", "EUR", "JPY"};

        for (int i = 0; i < payments.length; i++) {
            System.out.println("--- " + payments[i].getClass().getSimpleName() + " ---");
            System.out.println("Total Payment: " + payments[i].processPayment());
            System.out.println("Processed payment of " + payments[i].amount + " " + currencies[i] + " with total: " + payments[i].processPayment(currencies[i]));
            System.out.println();
        }
    }
}