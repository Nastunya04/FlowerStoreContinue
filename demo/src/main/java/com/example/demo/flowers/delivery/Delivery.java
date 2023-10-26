package com.example.demo.flowers.delivery;

import com.example.demo.flowers.flower.Flower;

import java.util.LinkedList;

public interface Delivery {
    public static String delivery(LinkedList<Flower> items) {
        return "Flower";
    }
}
