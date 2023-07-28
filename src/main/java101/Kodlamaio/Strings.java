package main.java101.Kodlamaio;

public class Strings {
    public static void main(String[] args) {

        String cumle="Bugün hava çok güzel.";
        System.out.println("Eleman sayısı:" + cumle.length());
        System.out.println("5. elemanı:" + cumle.charAt(4));
        System.out.println(cumle.concat("Yaşasın !"));

        // cümle B harfi ile başlarsa true
        // başlamıyorsa false döndürür.
        System.out.println(cumle.startsWith("B"));
        // son harfe bakma olayıda vardır.
        System.out.println(cumle.endsWith("."));

        char[] karakter=new char[5];
        cumle.getChars(0,5, karakter,0);
        System.out.println(karakter);

        // ilk bulduğu a harfinin indeksini verir.
        System.out.println(cumle.indexOf('a'));

        System.out.println(cumle.lastIndexOf("e"));

        System.out.println("==========================");

        // boşlukların arasına - işareti katıldı.

        String yenicumle=cumle.replace(' ','-');
        System.out.println(yenicumle);
        System.out.println(cumle.replace(' ','-'));


         // ikinci indeksten sonrasını alır.
        System.out.println(cumle.substring(2));
        System.out.println(cumle.substring(2,5));


        for(String kelime : cumle.split(" ")){
            System.out.println(kelime);

        }
        // bütün harfleri küçültecektir.
        System.out.println(cumle.toLowerCase());
        System.out.println(cumle.toUpperCase());

        // Başında ve sonundaki boşlkları kaldırır.
        String cumle2= "        Bugün hava çok güzel.      ";
        System.out.println(cumle2.trim());
    }
}
