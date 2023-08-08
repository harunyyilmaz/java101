package main.java101.Kodlamaio.JavaDersleri.Interfaces;

public class CustomerManager {

    private ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal=customerDal;

    }

    public void add() {
        // iş kodları.
        customerDal.add();
    }

}
