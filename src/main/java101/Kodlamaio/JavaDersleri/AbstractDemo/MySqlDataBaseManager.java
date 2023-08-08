package main.java101.Kodlamaio.JavaDersleri.AbstractDemo;

public class MySqlDataBaseManager extends BaseDataBaseManager{
    @Override
    public void getData() {
        System.out.println("Veri getirildi : MySql");
    }
}
