package furkan.PrimeNumber;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber pn = new PrimeNumber();
        System.out.println("Lütfen Bir Pozitif Sayı Giriniz: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(pn.isPrime(n));


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
        if(!prime)
            System.out.println("İlk Bölen: " + i);
        return prime;
    }


}
