package com.example.demo.flowers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //роздає різні url
@RequestMapping("/api/delivery")
public class DHLController {
    @GetMapping("/DHL")
    public String delivery(){
        return "Your order is delivered by DHL";
    }
}