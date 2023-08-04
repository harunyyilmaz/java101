package main.java101.Kodlamaio.HesapMakinesi;

public class Main {
    public static void main(String[] args) {

        DortIslem dortIslem = new DortIslem();
        int sonuc= dortIslem.Toplama(5,8);
        System.out.println(sonuc);
        dortIslem.Cikarma(12,5);
        dortIslem.Carpma(5,11);
        dortIslem.Bolme(8,2);
    }
}
