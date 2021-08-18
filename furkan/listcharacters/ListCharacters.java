package furkan.listcharacters;

public class ListCharacters {
    public static void main(String[] args) {

        for (char c = 0; c < 65535; c++) {
            System.out.print("\t" + (int) c + " : " + c);
            if (c % 10 == 0 & c != 0 & c != 10)
                System.out.print("\n");
        }
    }
}