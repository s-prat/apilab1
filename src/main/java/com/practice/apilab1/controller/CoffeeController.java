package com.practice.apilab1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoffeeController {

    @RequestMapping(value="/coffeelover", method= RequestMethod.GET)
    public String getCoffeeLover() {
        return "I like Coffee!";
    }
}
