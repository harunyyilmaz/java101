package main.java101.Kodlamaio.Customer;

public class Main {
    public static void main(String[] args) {

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("555000000");
        individualCustomer.setCustomerNummer("12345");
        individualCustomer.setFirstName("Harun");
        individualCustomer.setLastName("Yılmaz");


        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("5444444400");
        corporateCustomer.setTaxNumber("12345678910");
        corporateCustomer.setCustomerNummer("54321");

        Customer[] customers ={individualCustomer,corporateCustomer};
    }

}
