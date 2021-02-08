package com.kea;

public class Product {
    private String name;
    private double costInDkk;

    public Product(String name, double cost) {
        this.name = name;
        this.costInDkk = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return costInDkk;
    }

    public String toString(){
        return name + " " + String.format("%.2f", costInDkk) + " kr";
    }
}
