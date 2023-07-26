package main.java101;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Locale;

public class StringSinifi {
    public static void main(String[] args) {




        String str= "Patika";
        System.out.println(str.charAt(2));

        System.out.println(str.codePointAt(1)); // codunu verir.
        System.out.println(str.codePointBefore(1)); // önceki codu verir.


        String abc = "Patika";
        String def = "paTİKA";

        System.out.println(abc.compareTo(def)); // eşitlik olmadığı için çıktıda sayı verir.

        System.out.println(abc.compareToIgnoreCase(def)); // farklı yazım olmasına rağmen eşit olarak görür.


        String adi = "harun";
        System.out.println(adi.concat(" yılmaz"));

        System.out.println(adi.contains("HA")); // bu harfler bulunuyor mu diye bakar "" birleşik harf olarak bakıyor""
        System.out.println(adi.endsWith("un")); // son harfi ele alır nasıl bittiğine bakar

        String A = "songül";
        String B = "songül";
        System.out.println(A.equals(B));

        String cal= "Harun";
        System.out.println(cal.indexOf("H")); // H harfinin indeksini verir.
        System.out.println(cal.indexOf("n"));

        String x = "";
        System.out.println(x.isEmpty()); // değişkenin içi boş mu dolu mu onu true ya da false diye döndürür.

        String y = "patika";
        System.out.println(y.indexOf("a")); // ilk a nın indeksini vermiş olur.
        System.out.println(y.lastIndexOf("a")); // indeks numarasını verir en sondaki a nın indeksini vermiş olur.
        System.out.println(y.lastIndexOf("t")); // indeks numarasını verir.
        System.out.println(y.length()); // boyutunu verir.

        System.out.println(y.replace("a", "e")); // istediğin bir harfi değiştirebiliyorsun.
        System.out.println(y.replaceFirst("a","b")); // ilk önüne çıkan a harfini değiştirir.

        String STR = "patikacı harun";
        System.out.println(STR.replaceAll("a","i")); // cümlenin devamındaki harfleride değiştirir.

        String st = "patika";
        String[] sp = st.split("a");
        System.out.println(Arrays.toString(sp));

        System.out.println(st.startsWith("pa")); // p, pa, pat başaladığı için true ya da false döndürür.


        String zar = "PATika";
        System.out.println(zar.toLowerCase()); // harflerin hepsini küçültür.
        System.out.println(zar.toUpperCase()); // hepsini büyültür.

        String car="        Audi A7       ";
        System.out.println(car.trim()); // en sağındaki ve en solundai boşlukları siler.


    }
}
