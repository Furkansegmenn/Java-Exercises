package furkan.dowhile;

public class While {
    public static void main(String[] args) {

        int a = (int) (100 * Math.random());

        while (a > 100) {
            a = (int) (100 * Math.random());
            System.out.println("a: " + a);
        }
        System.out.println("a: " + a);
    }
}