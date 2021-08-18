package furkan.escapesequences;

public class Escapesequences {
    public static void main(String[] args){

        System.out.println("abc \n10"); // 10 u alt satıra atar
        System.out.println("abc \t10"); // 10 ile abc arasına boşuk koyar
        System.out.println("abc \b10"); // 10 ile abc arasında ki boşluğu kaldırır

        System.out.println("abc 10\b"); // 10 da ki 0 ı siler
        System.out.println("I\'m a boy"); // ' koymayı sağlar
        System.out.println("I\"m a boy"); // " koymayı sağlar
        System.out.println("I\\m a boy"); // \ koymayı sağlar
    }
}
