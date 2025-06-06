public class bt9 {
    public static class Fraction {
        private int numerator;
        private int denominator;
        public Fraction(int numerator, int denominator) {
            if (denominator == 0) {
                throw new IllegalArgumentException("Mẫu số không thể bằng 0");
            }
            this.numerator = numerator;
            this.denominator = denominator;
            simplify();
        }

        public Fraction add(Fraction other) {
            int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
            int newDenominator = this.denominator * other.denominator;
            return new Fraction(newNumerator, newDenominator);
        }

        public Fraction subtract(Fraction other) {
            int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
            int newDenominator = this.denominator * other.denominator;
            return new Fraction(newNumerator, newDenominator);
        }

        public Fraction multiply(Fraction other) {
            int newNumerator = this.numerator * other.numerator;
            int newDenominator = this.denominator * other.denominator;
            return new Fraction(newNumerator, newDenominator);
        }

        public Fraction divide(Fraction other) {
            if (other.numerator == 0) {
                throw new ArithmeticException("Không thể chia cho 0");
            }
            int newNumerator = this.numerator * other.denominator;
            int newDenominator = this.denominator * other.numerator;
            return new Fraction(newNumerator, newDenominator);
        }

        private void simplify() {
            int gcd = findGCD(Math.abs(numerator), Math.abs(denominator));
            numerator /= gcd;
            denominator /= gcd;
            if (denominator < 0) {
                numerator = -numerator;
                denominator = -denominator;
            }
        }

        private int findGCD(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        @Override
        public String toString() {
            return numerator + "/" + denominator;
        }
    }

    public static class bt9 {
        public void main(String[] args) {
            Fraction f1 = new Fraction(3, 4);
            Fraction f2 = new Fraction(2, 5);

            System.out.println("Phân số 1: " + f1);
            System.out.println("Phân số 2: " + f2);

            System.out.println("Cộng: " + f1.add(f2));
            System.out.println("Trừ: " + f1.subtract(f2));
            System.out.println("Nhân: " + f1.multiply(f2));
            System.out.println("Chia: " + f1.divide(f2));
        }
    }


}
