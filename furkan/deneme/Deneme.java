package furkan.deneme;

public class Deneme {
    public static void main(String[] args){
        byte b = 3;
        b = (byte) +b;
        b = (byte) +b;		// Unary promotion
        b = (byte) -b;		// Unary promotion
        b = (byte) ~b;		// Unary promotion

        byte b1 = ++b;
System.out.println(b);
        System.out.println("*************************");
System.out.println();
        int t=9;
        for(int i=0;i<10;i++)
        {

            for( int k=0;k<t;k++)
            {
                System.out.print("*");
            }
            t--;
            System.out.println("*");
        }
    }






}
