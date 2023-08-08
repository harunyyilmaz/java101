package main.java101.Kodlamaio.JavaDersleri.Overriding;


public class Main {
    public static void main(String[] args) {

        BaseKrediManager[] krediManagers = new BaseKrediManager[]{new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()};

        for(BaseKrediManager krediManager : krediManagers ){
            System.out.println(krediManager.hesaplama(1000));
        }

    }
}
