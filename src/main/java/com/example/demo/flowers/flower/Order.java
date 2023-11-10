package com.example.demo.flowers.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import com.example.demo.flowers.payment.Payment;
import com.example.demo.flowers.delivery.Delivery;

import java.util.LinkedList;

@AllArgsConstructor
@Getter @Setter
public class Order {
    private LinkedList<Item> items; // Changed from Flower to Item
    private Payment payment;
    private Delivery delivery;

    public int calculateTotalPrice() {
        double price = 0;
        for (Item currentItem: items) {
            price += currentItem.getPrice();
        }
        return (int) price;
    }

    public void processOrder() {
        this.payment.pay(this.calculateTotalPrice());
        this.delivery.delivery(this.items);
    }

    public void addItem(Item item) { // Changed from Flower to Item
        items.add(item);
    }

    public void removeItem(Item item) { // Changed from Flower to Item
        items.remove(item);
    }

    public  void setPaymentStrategy(Payment type){
        this.payment = type;
    }

    public void setDeliveryStrategy(Delivery type){
        this.delivery = type;
    }
}
