package com.example.demo.flowers.payment;

import com.example.demo.flowers.flower.Item;

import java.util.LinkedList;

public class CreditCardPaymentStrategy implements Payment {
//    @Override
    public String pay(int price) {
        return String.valueOf(price);
    }
}
