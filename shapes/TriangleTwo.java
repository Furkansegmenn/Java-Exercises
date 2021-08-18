package furkan.shapes;

public class TriangleTwo {
    public static void main(String[] args) {
        int a, b, c;

        for (a = 0; a < 10; a++) {
            for (b = a; b < 10; b++) {
                System.out.print(" ");
            }
            for (c=1;c<=a;c=c++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}