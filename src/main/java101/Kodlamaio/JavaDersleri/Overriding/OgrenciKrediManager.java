package main.java101.Kodlamaio.JavaDersleri.Overriding;

public class OgrenciKrediManager extends BaseKrediManager{

    public  double hesaplama(double tutar){
        return tutar * 1.10;
    }
}
