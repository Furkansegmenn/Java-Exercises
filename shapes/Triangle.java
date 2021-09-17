package furkan.shapes;

public class Triangle {
    public static void main(String[] args) {
        int a, c;
        int yıldız = 1;

        for (a = 0; a < 9; a++) {
            for (c = 0; c < yıldız; c++) {
                System.out.print("*");
            }
            System.out.println("");
            yıldız++;
        }
    }
}



