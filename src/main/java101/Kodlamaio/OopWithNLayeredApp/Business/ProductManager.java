package main.java101.Kodlamaio.OopWithNLayeredApp.Business;


import main.java101.Kodlamaio.OopWithNLayeredApp.Core.Logging.Logger;
import main.java101.Kodlamaio.OopWithNLayeredApp.DataAccsess.ProductDao;
import main.java101.Kodlamaio.OopWithNLayeredApp.Entities.Product;

import java.util.List;


public class ProductManager {
    private ProductDao productDao;
    private Logger[]loggers;

    public ProductManager(ProductDao productDao, Logger[]loggers) {
        this.productDao = productDao;
        this.loggers=loggers;
    }

    public void add(Product product) throws Exception{
        // iş kuralları yazılıyor.

        if(product.getUnitPrice() < 10){

            throw new Exception("Ürün fiyatı 10 dan küçük olamaz.");

        }


        productDao.add(product);
        for (Logger loger : loggers){  //[db,mail]
            loger.log(product.getName());
        }
    }
}
