package main.java101.Kodlamaio.Product2;

public class Main {
    public static void main(String[] args) {


        Product product = new Product();

       product.setName("Laptop");
       product.setId(1);
       product.setStockAmount(3);
       product.setDescription("Asus Laptop");
       product.setPrice(5000);
       product.setColor("Siyah");



       ProductManager productManager = new ProductManager();

       productManager.Add(product);
    }
}
