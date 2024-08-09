package ec.edu.espol;

public class Paper extends Choice {
    @Override
    public boolean beats(Choice choice) throws DrawException{
        if(choice instanceof Paper){
            throw new DrawException();
        }
        return choice instanceof Rock;
    }
    
}
