package com.example.demo.flowers.delivery;

import com.example.demo.flowers.flower.Flower;
import com.example.demo.flowers.flower.Item;

import java.util.LinkedList;

public interface Delivery {
    String delivery(LinkedList<Item> items);
}
