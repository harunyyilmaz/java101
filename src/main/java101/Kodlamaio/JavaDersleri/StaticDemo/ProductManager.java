package main.java101.Kodlamaio.JavaDersleri.StaticDemo;

public class ProductManager {
    public void add(Product product) {

        ProductValidator productValidator = new ProductValidator();
        if (productValidator.isValid(product)) {
            System.out.println("Eklendi.");
        }else{
            System.out.println("Ürün bilgileri geçersizdir.");
        }
    }
}
