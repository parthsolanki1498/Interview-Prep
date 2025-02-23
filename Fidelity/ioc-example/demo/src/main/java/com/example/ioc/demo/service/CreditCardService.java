package com.example.ioc.demo.service;

// import org.springframework.stereotype.Service;

// @Service
public class CreditCardService implements PaymentService {

    public String processPayment(double amount) {
        return "Paid $ " + amount + " using Credit Card.";
    }
}
