package com.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    

    @SuppressWarnings("FieldMayBeFinal")
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer){
        observers.remove(observer);
    }

    public void notifyAllObservers(String message) {
        for( Observer observer : observers) {
            observer.update(message);
        }
    }
}
