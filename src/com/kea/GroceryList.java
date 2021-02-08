package com.kea;

import java.util.ArrayList;

public class GroceryList {

    ArrayList<GroceryItem> list = new ArrayList<>();

    public void add(GroceryItem item){
        list.add(item);
    }

    public double getTotalCost(){
        double total = 0;
        return total;
    }

    public void print() {
        System.out.println("\n*** Grocery List ***");
        for(GroceryItem item: list){
            System.out.println(item);
        }
        System.out.println();
    }
}
