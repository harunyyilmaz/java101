package main.java101.Kodlamaio.Classes;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;

        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();


    }
}
