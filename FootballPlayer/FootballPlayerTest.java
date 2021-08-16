package Furkan.FootballPlayer;

public class FootballPlayerTest {
    public static void main(String[] args){
        FootballPlayer Furkan= new FootballPlayer();
        Furkan.no=4;
        Furkan.name= "Furkan Segmen";
        Furkan.minutes= 0;
        Furkan.inPlay=true;
        Furkan.numberOfGoals=0;

        Furkan.play(90);
        Furkan.score();

        System.out.println("Nuber Of Goals Furkan Scored: "+ Furkan.numberOfGoals);
        System.out.println("Furkan minutes totally: "+ Furkan.minutes+ " minutes so far");

        Furkan.play(60);
        Furkan.score();
        Furkan.score();

        System.out.println("Nuber Of Goals Furkan Scored: "+ Furkan.numberOfGoals);
        System.out.println("Furkan minutes totally: "+ Furkan.minutes+ " minutes so far");

        System.out.println("******************");

        FootballPlayer Ronaldo= new FootballPlayer();
        Ronaldo.no=7;
        Ronaldo.name= "Cristiano Ronaldo";
        Ronaldo.minutes= 0;
        Ronaldo.inPlay=true;
        Ronaldo.numberOfGoals=0;

        Ronaldo.play(90);
        Ronaldo.score();
        Ronaldo.score();
        Ronaldo.score();

        System.out.println("Nuber Of Goals Ronaldo Scored: "+ Ronaldo.numberOfGoals);
        System.out.println("Ronaldo minutes totally: "+ Ronaldo.minutes+ " minutes so far");

    }



}