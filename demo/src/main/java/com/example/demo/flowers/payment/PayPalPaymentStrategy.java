package com.example.demo.flowers.payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public Integer pay(int price) {
        return 1;
    }
}
