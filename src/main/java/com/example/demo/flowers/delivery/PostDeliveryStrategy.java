package com.example.demo.flowers.delivery;

import com.example.demo.flowers.flower.Flower;
import com.example.demo.flowers.flower.Item;
import lombok.AllArgsConstructor;

import java.util.LinkedList;

@AllArgsConstructor
public class PostDeliveryStrategy implements Delivery {

    public String delivery(LinkedList<Item> items) {
        return "Your package is delivered by Post";
    }
}

