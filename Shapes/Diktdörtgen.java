package Furkan.Shapes;

public class Diktdörtgen {

    public static void main(String[] args) {
        Diktdörtgen r = new Diktdörtgen();
        r.drawrecktangle(10, 5);
    }

    public void drawrecktangle(int satır, int sutun) {

        for (int a = 0; a < satır; a++) {
            for (int b = 0; b < sutun; b++) {
                System.out.print("*");
                if (b == sutun - 1) {
                    System.out.println("*");
                    }
                }
            }
        }
    }



