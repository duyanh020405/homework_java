package btvn;

import java.util.ArrayList;
import java.util.Scanner;


    public class bt9 {

        public static boolean isPrime(int n) {
            if (n < 2) return false;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Nhập số lượng phần tử: ");
            int n = sc.nextInt();
            ArrayList<Integer> numbers = new ArrayList<>();

            System.out.println("Nhập các số:");
            for (int i = 0; i < n; i++) {
                numbers.add(sc.nextInt());
            }

            ArrayList<Integer> primes = new ArrayList<>();
            ArrayList<Integer> evens = new ArrayList<>();
            ArrayList<Integer> odds = new ArrayList<>();

            for (int num : numbers) {
                if (isPrime(num)) {
                    primes.add(num);
                } else if (num % 2 == 0) {
                    evens.add(num);
                } else {
                    odds.add(num);
                }
            }

            System.out.println("Số nguyên tố: " + primes);
            System.out.println("Số chẵn: " + evens);
            System.out.println("Số lẻ: " + odds);

            sc.close();
        }
    }