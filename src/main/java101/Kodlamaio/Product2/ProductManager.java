package main.java101.Kodlamaio.Product2;

public class ProductManager {

     public void Add(Product product){
         System.out.println("Ürün eklendi:" + product.getName());
         System.out.println("Id :" + product.getId());
         System.out.println("Ürünün rengi:" + product.getColor());
         System.out.println("Ürünün açıklaması:"+ product.getDescription());
         System.out.println("Ürünün stok sayısı:" + product.getStockAmount());
         System.out.println("ürünün fiyatı:" + product.getPrice());
         System.out.println("Ürünün kodu:" + product.getKod());

    }

}
