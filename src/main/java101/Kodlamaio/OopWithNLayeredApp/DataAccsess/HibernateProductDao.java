package main.java101.Kodlamaio.OopWithNLayeredApp.DataAccsess;

import main.java101.Kodlamaio.OopWithNLayeredApp.Entities.Product;

public class HibernateProductDao implements ProductDao{

    public void add(Product product){
        // sadece ve sadece db erişim kodları buraya yazılır... SQL ile
        System.out.println("Hibernate ile veri tabanına eklendi.");
    }
}
