package furkan.shapes;

public class RecktangleTwo {
    public static void main(String[] args) {
        RecktangleTwo r = new RecktangleTwo();
        r.drawRecktangle2(10, 5);
    }

    public void drawRecktangle2(int satır, int sutun) {
        for (int a = 0; a < satır; a++) {
            for (int b = 0; b < sutun; b++) {
                if (a == 0 | a == satır - 1) {
                    System.out.print("*");
                    if (b == sutun - 1)
                        System.out.println();
                } else {
                    if (b == 0)
                        System.out.print("*");
                    else if (b == sutun - 1)
                        System.out.println("*");
                    else
                        System.out.print(" ");
                }
            }
        }

    }

}


