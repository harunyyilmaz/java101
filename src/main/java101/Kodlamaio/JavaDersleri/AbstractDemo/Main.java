package main.java101.Kodlamaio.JavaDersleri.AbstractDemo;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        customerManager.dataBaseManager = new MySqlDataBaseManager();
        customerManager.getCustomers();

    }
}
