package furkan.PrimeNumber;

import java.util.Scanner;

public class CounterOfPrimeNumber {
    public static void main(String[] args) {
        CounterOfPrimeNumber pn = new CounterOfPrimeNumber();
        System.out.println("Lütfen Bir Pozitif Tam Sayı Giriniz: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pn.countNumberOfPrimeUpTo(n);

    }

    boolean isPrime(int n) {
        boolean prime = true;
        int i = 2;
        int upperBound = (int) Math.sqrt(n) + 1;
        for (; i < upperBound; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        return prime;
    }

    void countNumberOfPrimeUpTo(int n) {
        int numberOfPrimes = 0;
        for (int i = 2; i < n; i++) {
            boolean prime = isPrime(i);
            if (prime) {
                numberOfPrimes++;
            }

        }
        System.out.println(n + " sayısına kadar " + numberOfPrimes + " tane asal sayı vardır.");
    }
}
