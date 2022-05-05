package com.practice.apilab1.controller;

import com.practice.apilab1.model.Coffee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class CoffeeController {

    @RequestMapping(value="/coffeelover", method= RequestMethod.GET)
    public String getCoffeeLover() {
        return "I like Coffee!";
    }

    @RequestMapping(value="/coffee/{id}", method= RequestMethod.GET)
    public Coffee getCoffee(@PathParam("id") Integer id , @RequestParam(defaultValue = "Black") String name) {
        return new Coffee(id, name);
    }
}
