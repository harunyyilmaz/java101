package main.java101.Kodlamaio.JavaDersleri.StaticDemo;


public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.price=10.0;
        product.id=1;
        product.name="Mause";
        productManager.add(product);



    }
}
