package ec.edu.espol;

public class Round{
    private Player winner;
    private Choice choiceP1;
    private Choice choiceP2;

    public Player getWinner() {
        return winner;
    }

    public void play(Player p1, Player p2){
        try{
            setChoices(p1,p2);
            determineWinner(p1,p2);
        } catch(DrawException de){
            winner = null;
            System.out.println(de.getMessage());
        }
    }

    public void setChoices(Player p1, Player p2){
        choiceP1 = p1.choice();
        choiceP1 = p2.choice();
    }

    public void determineWinner(Player p1, Player p2) throws DrawException{
        boolean ifP1Wins = choiceP1.beats(choiceP2);
        if(ifP1Wins){
            winner = p1;
            p1.setWins();
        } else{
            winner = p2;
            p2.setWins();
        }
    }

}