package ec.edu.espol;

public class Scissors extends Choice {
    @Override
    public boolean beats(Choice choice) throws DrawException {
        if(choice instanceof Scissors){
            throw new DrawException();
        }
        return choice instanceof Paper;
    }
    
}
