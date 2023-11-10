package com.example.demo.flowers.flower;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FlowerColor {
    RED("red"), GREEN("green");
    private String value;

    FlowerColor(String value) {
        this.value = value;
    }

    @JsonValue
    public String toString() {
        return value;
    }
}
