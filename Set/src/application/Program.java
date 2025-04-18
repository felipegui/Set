package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Program {
    public static void main(String[] args) throws Exception {

        Set<Product> set = new HashSet<>();

        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 900.0));

        Product prod = new Product("Notebook", 1200.0);
        System.out.println(set.contains(prod));
    }
}
