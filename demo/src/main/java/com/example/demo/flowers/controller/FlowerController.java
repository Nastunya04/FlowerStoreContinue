package com.example.demo.flowers.controller;

import com.example.demo.flowers.flower.Flower;
import com.example.demo.flowers.flower.FlowerColor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //роздає різні url
@RequestMapping("/api/flower")
public class FlowerController {

    @GetMapping("/list")
    public List<Flower> getFlower(){
        return List.of(new Flower(45, 0.8, FlowerColor.RED));
    }
}
