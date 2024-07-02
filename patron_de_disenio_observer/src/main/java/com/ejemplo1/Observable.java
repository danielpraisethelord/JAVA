package com.ejemplo1;

public interface Observable {
    void addObserver(Observer o);
    void deleteObserver(Observer o);
    void notifyObserver();
}
