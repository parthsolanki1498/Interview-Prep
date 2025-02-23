package com.example.ioc.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// @Service
public class BitCoinService implements PaymentService {
    
    @Autowired
    private PaymentService paymentService; // Avoid field injection

    @Override
    public String processPayment(double amount) {
        return "Paid $ " + amount + "using Bitcoin";
    }
}
