package com.company;

public class ProductManager {

    public void Add(Product product) {
        //JDBC

        System.out.println("Urun eklendi: " + product.getName() +
                "\nUrun kodu: " + product.getKod() +
                "\nUrun stok adet: " + product.getStockAmount() +
                "\nUrun aciklamasi: " + product.getDescription());

    }

    public void Add2(int id, String name, String description, int stockAmount) {

    }
}
