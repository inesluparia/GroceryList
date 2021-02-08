package com.kea;

public class Main {

    public static void main(String[] args) {
	// write your code here

        var candle = new Product("candle",14.50);
        var soup = new Product("Soup",32);
        var catalogue = new ProductCatalogue("catalogue.txt");
        catalogue.print();

        var item1 = new GroceryItem(soup,2);
        System.out.println(item1.getItemCost());
        var item2 = new GroceryItem(catalogue.products.get(0),2);
        System.out.println(item2.getItemCost());


        var groceryList = new GroceryList();
    groceryList.add(item1);
    groceryList.add(item2);

    groceryList.print();

    }
}
