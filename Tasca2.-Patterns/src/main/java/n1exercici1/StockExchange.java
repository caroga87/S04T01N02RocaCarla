package n1exercici1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class StockExchange implements  Observable {

    private ArrayList<Observer> observerSet = new ArrayList<>();

    public StockExchange() {

    }

    @Override
    public void addObserver(Observer o) {
        observerSet.add(o);

    }

    @Override
    public void deleteObserver(Observer o) {
        observerSet.remove(o);

    }

    @Override
    public void notifyObserver(boolean marketGoesUp) {
        for (Observer o : observerSet) {
            o.update(marketGoesUp);
        }

    }

    public void marketChange(boolean marketGoesUp) {
        System.out.println("Market change detected");
        notifyObserver(marketGoesUp);

    }
}
