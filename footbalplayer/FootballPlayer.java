package furkan.footbalplayer;

public class FootballPlayer {
    int no;
    int numberOfGoals;
    int minutes;
    String name;
    boolean inPlay;

    void play(int minutesToPlay) {
         minutes= minutes+minutesToPlay;
    }
    void score(){
        numberOfGoals++; //numberOfGoals=numberOfGoals+1; bu ikisi aynı anlama gelir
    }
}