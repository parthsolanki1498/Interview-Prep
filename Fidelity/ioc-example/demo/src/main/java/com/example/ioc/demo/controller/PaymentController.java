package com.example.ioc.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ioc.demo.service.PaymentService;


@RestController
@RequestMapping("/payment")
public class PaymentController {

    private final PaymentService paymentService;

    // Constructor Injection
    public PaymentController (PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/{amount}") 
        public String pay(@PathVariable double amount) {
            return paymentService.processPayment(amount);
    }
}
