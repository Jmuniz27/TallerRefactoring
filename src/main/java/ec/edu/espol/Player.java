package ec.edu.espol;

public class Player {
    private Choice choice;
    private int wins = 0;
    
    public Choice choice() {
        return choice;
    }
    public int getWins() {
        return wins;
    }
    
    public int setWins() {
        return wins++;
    }

    public void makeChoice() {
        int randomIndex = (int) (Math.random() * 3);
        System.out.println(randomIndex);
        switch (randomIndex) {
            case 0: choice = new Rock(); break;
            case 1: choice = new Paper(); break;
            case 2: choice = new Scissors(); break;
        }
    }
}
