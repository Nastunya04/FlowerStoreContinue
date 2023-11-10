package com.example.demo.flowers.payment;

public interface Payment {
    default Integer pay(int price) {
        return price;
    }
}