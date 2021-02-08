package com.kea;

public class GroceryItem {
    Product product;
    int quantity;

    public GroceryItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public double getCost(){
        return product.getCost()*quantity;
    }

    public String toString(){
        return quantity + " x " + product;
    }
}
