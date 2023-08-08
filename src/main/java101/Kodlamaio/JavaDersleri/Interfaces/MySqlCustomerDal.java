package main.java101.Kodlamaio.JavaDersleri.Interfaces;

public class MySqlCustomerDal implements ICustomerDal , Irepository{
    @Override
    public void add() {
        System.out.println("My Sql eklendi");
    }
}
