package com.kea;

public class GroceryItem {
    Product product;
    int quantity;

    public GroceryItem(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
    }

    public double getItemCost(){
        return product.getCost() * quantity;
    }

    public String toString(){
        return product + " x " + quantity;
    }
}
