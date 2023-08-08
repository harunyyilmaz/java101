package main.java101.Kodlamaio.JavaDersleri.Interfaces;

public class SqlCustomerDal implements ICustomerDal{

    @Override
    public void add() {
        System.out.println("Sql eklendi");
    }
}
