package com.example.demo.flowers.payment;

public class PayPalPaymentStrategy implements Payment {
//    @Override
    public String pay(int price) {
        return String.valueOf(price);
    }
}
