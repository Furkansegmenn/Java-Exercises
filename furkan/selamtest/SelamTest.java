package furkan.selamtest;

import furkan.selam.Selam;

public class SelamTest {

    public static void main(String[] args) {
        Selam nesne = new Selam();

        String cevap = nesne.selamSoyle("Ali");
        System.out.println(cevap);
    }
}

