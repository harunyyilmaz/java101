package main.java101.Kodlamaio.Product;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(8);
        product2.setUnitPrice(8000);
        product2.setUnitsInStock(4);
        product2.setImageUrl("image2.jpg");



        Product product3 = new Product();
        product3.setName("Kitchen Aid Khave Makinesi");
        product3.setDiscount(6);
        product3.setUnitPrice(6000);
        product3.setUnitsInStock(2);
        product3.setImageUrl("image3.jpg");


        Product[] products = {product1,product2,product3};

        System.out.println("<ul>");
        for(Product product : products){
            System.out.println("<li>" + product.getName() + "</li>");
            System.out.println("<li>" + product.getUnitPrice() + "</li>");
        }
        System.out.println("</ul>");
    }
}
