package ec.edu.espol;

public class Rock extends Choice {
    @Override
    public boolean beats(Choice choice) throws DrawException{
        if(choice instanceof Rock){
            throw new DrawException();
        }
        return choice instanceof Scissors;
    }
    
}
