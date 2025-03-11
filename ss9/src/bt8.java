public class bt8 {
    static class BankAccount {
        String accountNumber;
        String accountHolder;
        double balance;

        public BankAccount(String accountNumber, String accountHolder, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Nạp tiền thành công: " + amount);
            } else {
                System.out.println("Số tiền nạp không hợp lệ.");
            }
        }

        public void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Số dư không đủ.");
            } else if (amount > 0) {
                balance -= amount;
                System.out.println("Rút tiền thành công: " + amount);
            } else {
                System.out.println("Số tiền rút không hợp lệ.");
            }
        }

        public void transfer(BankAccount recipient, double amount) {
            if (amount > 0 && amount <= balance) {
                this.balance -= amount;
                recipient.balance += amount;
                System.out.println("Chuyển tiền thành công: " + amount + " đến " + recipient.accountHolder);
            } else {
                System.out.println("Chuyển tiền thất bại: Số tiền không hợp lệ hoặc không đủ.");
            }
        }

        public void display() {
            System.out.println("Số tài khoản: " + accountNumber);
            System.out.println("Tên chủ tài khoản: " + accountHolder);
            System.out.println("Số dư: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("123456", "Nguyễn Văn A", 5000);
        BankAccount acc2 = new BankAccount("654321", "Trần Thị B", 3000);

        acc1.display();
        acc2.display();

        acc1.deposit(1000);
        acc1.withdraw(2000);
        acc1.transfer(acc2, 1500);

        acc1.display();
        acc2.display();
    }
}
