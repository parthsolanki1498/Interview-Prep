package com.example.ioc.demo.service;

// import org.springframework.stereotype.Service;


// @Service
public class PayPalService implements PaymentService {
    
    private PaymentService paymentService;

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public String processPayment(double amount) {
        return "Paid $ " + amount + " using Paypal";
    }
}
