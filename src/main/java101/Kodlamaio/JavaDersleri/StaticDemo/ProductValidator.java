package main.java101.Kodlamaio.JavaDersleri.StaticDemo;

public class ProductValidator {
    public boolean isValid(Product product){
        if(product.price > 0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
