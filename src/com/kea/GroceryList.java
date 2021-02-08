package com.kea;

import java.util.ArrayList;

public class GroceryList {

    ArrayList<GroceryItem> list = new ArrayList<>();

    public void add(GroceryItem item){
        list.add(item);
    }

    public double getTotalCost(){
        double total = 0;

        for (GroceryItem gi : list){
            total += gi.getItemCost();
        }
        return total;
    }

    public void print() {
        System.out.println("\n*** Grocery List ***");
        for(GroceryItem item: list){
            System.out.println(item);
        }
        System.out.println("Total cost: "+String.format("%.2f", getTotalCost())+" kr.");
        System.out.println();
    }
}
