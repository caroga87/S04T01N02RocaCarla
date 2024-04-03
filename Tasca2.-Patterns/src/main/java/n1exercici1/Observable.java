package n1exercici1;

public interface Observable {

    void addObserver (Observer o);
    void deleteObserver (Observer o);
    void notifyObserver (boolean marketGoesUp);

}
