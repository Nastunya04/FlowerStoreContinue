package com.example.demo.flowers.delivery;

import com.example.demo.flowers.flower.Flower;
import com.example.demo.flowers.flower.Item;
import lombok.AllArgsConstructor;

import java.util.LinkedList;

@AllArgsConstructor
public class DHLDeliveryStrategy implements Delivery {
//    @Override
    public static String delivery(LinkedList<Item> items) {
        return "Your order is delivered by DHL";
    }
}
