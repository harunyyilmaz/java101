package main.java101.Kodlamaio.OopWithNLayeredApp.DataAccsess;

import main.java101.Kodlamaio.OopWithNLayeredApp.Entities.Product;

public class JdbcProductDao implements ProductDao {
    public void add(Product product){

        // sadece ve sadece db erişim kodları buraya yazılır... SQL ile
        System.out.println("Jdbc ile veri tabanına eklendi.");

    }

}
