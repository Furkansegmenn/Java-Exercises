package furkan.MonteCarloPI;

import java.util.Scanner;

public class MonteCarloPI {
    public static void main(String[] args) {
        System.out.println("Nokta Sayısı Girin: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int numberInCircle = 0;

        long start = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            double x = Math.random();
            double y = Math.random();
            double distance = Math.pow(x, 2) + Math.pow(y, 2);
            if (distance <= 1) {
                numberInCircle++;
            }

        }
        long end = System.currentTimeMillis();
        long time = end - start;


        double myPI = 4.0 * numberInCircle / n;
        System.out.println("My Pi: " + myPI);
        System.out.println("Java's Pi: " + Math.PI);
        System.out.println("Time is: " + time + "ms.");

    }
}
