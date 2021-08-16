package Furkan.FindingAge;

public class FindinAge {
    public static void main(String[] args) {
int bebeksayisi=0;
int cocuksayisi=0;
int ergensayisi=0;
int ortayaslısayısı=0;
int yaslısayısı=0;

        for (int i = 0; i < 5; i++) {

            int a = (int) (Math.random() * 150);

            if (a < 4) {
                bebeksayisi++;
                System.out.println("a: " + a + " Bebek");
            } else if (a > 4 & a <= 13) {
                cocuksayisi++;
                System.out.println("a: " + a + " Çccuk");
            } else if (a > 13 & a <= 20){
                ergensayisi++;
                System.out.println("a: " + a + " Ergen");
        }else if (a > 20 & a <= 31) {
                    ergensayisi++;
                System.out.println("a: " + a + " Genç");
            }else if (a > 31 & a <= 61) {
                ortayaslısayısı++;
                System.out.println("a: " + a + " Orta Yaşlı");
            }else if (a > 61 & a <= 120) {
                yaslısayısı++;
                System.out.println("a: " + a + " Yaşlı");
            }else
                    System.out.println("a: " + a + " Çık");


        }
        System.out.println("bebek sayısı= "+bebeksayisi);
        System.out.println("cocuk sayısı= "+cocuksayisi);
        System.out.println("ergen sayısı= "+ergensayisi);
        System.out.println("orta yaşlı sayısı= "+ortayaslısayısı);
        System.out.println("yaslı sayısı= "+yaslısayısı);
    }
}