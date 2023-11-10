package com.example.demo.flowers.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Flower {
    private double price;
    private double sepalLength;
    private FlowerColor color;
}
