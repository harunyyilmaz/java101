package main.java101.Kodlamaio.OopWithNLayeredApp;


import main.java101.Kodlamaio.OopWithNLayeredApp.Business.ProductManager;
import main.java101.Kodlamaio.OopWithNLayeredApp.Core.Logging.DatabaseLogger;
import main.java101.Kodlamaio.OopWithNLayeredApp.Core.Logging.FileLogger;
import main.java101.Kodlamaio.OopWithNLayeredApp.Core.Logging.Logger;
import main.java101.Kodlamaio.OopWithNLayeredApp.Core.Logging.MailLogger;
import main.java101.Kodlamaio.OopWithNLayeredApp.DataAccsess.HibernateProductDao;

import main.java101.Kodlamaio.OopWithNLayeredApp.Entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {

        Product product1 = new Product(1,"Iphone",10000);

        Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);


    }
}
