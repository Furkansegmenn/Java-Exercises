package furkan.SieveOfErostosthenes;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfErostosthenes {
    public static void main(String[] args) {
        SieveOfErostosthenes soe = new SieveOfErostosthenes();
        System.out.println("Lütfen Bir Pozitif Tam Sayı Giriniz: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        soe.countNumberOfPrimeUpTo(n);

    }

    void countNumberOfPrimeUpTo(int n) {
        boolean[] list = new boolean[n + 1];
        Arrays.fill(list, true);

        int upperBound = (int) Math.sqrt(n) + 1;

        for (int i = 2; i <= upperBound; i++) {
            if (list[i] == true)
                for (int j = 2; i * j <= n; j++)
                    list[i * j] = false;

        }
        int numberOfPrimes = 0;
        for (boolean b : list) {
            if (b)
                numberOfPrimes++;
        }
        System.out.println(n + " sayısına kadar " + (numberOfPrimes - 2) + " tane asal sayı vardır.");
    }
}
