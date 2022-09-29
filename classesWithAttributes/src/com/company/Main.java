package com.company;

public class Main {

    public static void main(String[] args) {

        //constructor kullanarak veri alma
        Product product = new Product(23,"Laptop","yeni laptop",23,9);


        /*Product product = new Product();
        product.setName("Laptop");
        product.setId(23);
        product.setDescription("yeni laptop");
        product.setPrice(2300);
        product.setStockAmount(8);
        product.getKod();*/

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

    }
}
