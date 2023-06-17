package main.java101;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {

        int mat,fizik,kimya,turkce,muzik,tarih;

        Scanner input=new Scanner(System.in);

        System.out.print("matematik notu:");
        mat= input.nextInt();

        System.out.print("fizik notu:");
        fizik= input.nextInt();

        System.out.print("kimya notu:");
        kimya= input.nextInt();

        System.out.print("turkce notu:");
        turkce=input.nextInt();

        System.out.print("muzik notu:");
        muzik=input.nextInt();

        System.out.print("tarih notu:");
        tarih=input.nextInt();



        int toplam = (mat+fizik+kimya+turkce+muzik+tarih);

        double ortalama = toplam/6.0;
        System.out.println("ortalamanız"+ ortalama);

        double kosul=70;

        boolean gecerli= ortalama>kosul;
        System.out.println("teşekkür belgesi"+gecerli);





    }
}
