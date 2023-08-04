package main.java101.Kodlamaio.JavaDersleri;

public class Arguments {
    public static void main(String[] args) {
        int sayi = topla(8,9);
        System.out.println(sayi);
        int toplam = topla(5,2,3,6,8,5,64,7);
        System.out.println(toplam);

    }

    public static int topla(int a, int b){
        return a+b;
    }
    public static int topla(int... sayilar){

        int toplam=0;
        for(int sayi : sayilar){
            toplam += sayi;
        }
        return toplam;
    }

}
