package main.java101.Kodlamaio.JavaDersleri.Interfaces;

public class OrecalCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("Orecal eklendi");
    }
}
