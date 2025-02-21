package com.designpatterns.behavioral.observer;

public class Main {
    
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        Observer user1 = new User("Parth");
        Observer user2 = new User("Maya");

        service.subscribe(user1);
        service.subscribe(user2);

        service.notifyAllObservers("New Notification");
    }
}
