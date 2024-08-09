package ec.edu.espol;

import java.util.ArrayList;

public class RPMGame {
    private static Player p1;
    private static Player p2;
    private static ArrayList<Round> rounds;
    

    public static void main(String[] args) {
        start();
        while(canPlayMoreRounds()){
            Round round = new Round();
            p1.makeChoice();
            p2.makeChoice();
            round.play(p1,p2);
            rounds.add(round);
            selectTotalWinner();
        }
    }

    public static boolean canPlayMoreRounds(){
        int cantNotDraw = 0;
        for(Round r: rounds){
            if(r.getWinner() != null){
                cantNotDraw ++;
            }
        }
        return cantNotDraw < 3;
    }

    public static void selectTotalWinner(){
        if(p1.getWins()>p2.getWins()){
            System.out.println("Player 1 won!");
        } else{
            System.out.println("Player 2 won!");
        }
    }

    public static void start(){
        rounds = new ArrayList<>();
        p1 = new Player();
        p2 = new Player();
    }
}