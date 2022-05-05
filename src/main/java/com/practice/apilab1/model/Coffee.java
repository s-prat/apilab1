package com.practice.apilab1.model;

public class Coffee {

    private Integer id;
    private String name;

    public Coffee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
