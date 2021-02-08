package com.kea;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductCatalogue {

    File  catalogueFile;
    ArrayList<Product> products;

    public ProductCatalogue(String path){
        products = new ArrayList<>();
        catalogueFile = new File(path);
        load();
    }

    public void load(){
        try {
            Scanner fileSc = new Scanner(catalogueFile);
            while (fileSc.hasNext()){
                String line = fileSc.nextLine();
                products.add(new Product(getNameFromLine(line),getCostFromLine(line)));
            }

        } catch (FileNotFoundException FnFe){
            System.out.println("File not found");
        }
    }

    public String getNameFromLine(String line){
        return line.substring(0,line.lastIndexOf(' '));
    }

    public double getCostFromLine(String line){
        String costString = line.substring(line.lastIndexOf(' '));
        return Double.parseDouble(costString);
    }

    public void print(){
        System.out.println("\n*** Product Catalogue ***");
        for (Product p : products){
            System.out.println(p);
        }
        System.out.println();
    }

}


