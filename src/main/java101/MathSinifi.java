package main.java101;

public class MathSinifi {
    public static void main(String[] args) {

        System.out.println(Math.abs(-50)); // Mutlak değerini alır.
        System.out.println(Math.ceil(1.2)); // en yakın üst değere yuvarlama yapar.
        System.out.println(Math.floor(1.9)); // en yakın alt değere yuvarlam yapar.
        System.out.println(Math.cbrt(27)); // küp kökünü alır.
        System.out.println(Math.log10(100)); // log10 Hesaplar.
        System.out.println(Math.max(100,20)); // max değeri verir.
        System.out.println(Math.min(20,5)); // min değerini verir.
        System.out.println(Math.pow(2,5)); // üssü hesabı
        System.out.println(Math.random()); // 0 İLE 1 arasında sayı hesaplar


        System.out.println(Math.round(10.9)); //  hangi değere yakınsa ona yuvarlar İNT olarak yuvarlama yapar
        System.out.println(Math.round(10.1));

        System.out.println(Math.rint(10.9)); // hangi değere yakınsa ona göre yuvarlar DOUBLE olarak yuvarlama yapar

        System.out.println(Math.signum(-10100));
        System.out.println(Math.signum(100662));

        System.out.println(Math.sqrt(25)); // karekök hesabı yapar

    }
}
