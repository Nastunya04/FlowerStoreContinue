package com.example.demo.flowers.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //роздає різні url
@RequestMapping("/api/payment")
public class CreditCardController {
    @GetMapping("/CreditCard")
    public String pay() {
        return "This payment is made by credit card";
    }
}
