package sample;

import java.util.Observable;

public class Model extends Observable {

    private int countDown;

    public Model() {
        countDown = 10;
    }

    public int getCountDown() {
        return countDown;
    }

    public void tick() {
        if (countDown > 0) {
            countDown--;
            setChanged();
        }
        notifyObservers();
    }

}