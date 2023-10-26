package com.example.demo.flowers.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;

import com.example.demo.flowers.payment.Payment;
import com.example.demo.flowers.delivery.Delivery;
import lombok.Setter;

import java.util.LinkedList;

@AllArgsConstructor
@Getter @Setter
public class Order {
    private LinkedList<Flower> items;
    private Payment payment;
    private Delivery delivery;

    public int calculateTotalPrice() {
        double price = 0;
        for (Flower currentItem: items) {
            price += currentItem.getPrice();
        }
        return (int) price;
    }

    public void processOrder() {
        Payment.pay(this.calculateTotalPrice());
        Delivery.delivery(this.items);
    }

    public  void addItem(Flower Item) {
        items.add(Item);
    }
    public  void removeItem(Flower item) {
        items.remove(item);
    }

    public  void setPaymentStrategy(Payment type){
        this.payment = type;
    }

    public void setDeliveryStrategy(Delivery type){
        this.delivery = type;
    }
}
