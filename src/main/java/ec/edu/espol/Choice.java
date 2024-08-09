package ec.edu.espol;

public abstract class Choice{
    public abstract boolean beats(Choice choice) throws DrawException;
}
