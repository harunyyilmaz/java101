package main.java101.Kodlamaio.JavaDersleri;

public class Methods2 {


    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String yenimesaj = mesaj.substring(0,2);
        System.out.println(yenimesaj);
        String sehir=sehirVer();
        int sayi=topla(5,7);
        System.out.println(sayi);


    }
    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static int topla(int sayi1, int sayi2){
        return sayi2+sayi1;
    }
    public static String sehirVer(){
        return "Ankara";
    }
}
