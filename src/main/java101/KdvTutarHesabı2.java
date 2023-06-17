package main.java101;

import java.util.Scanner;

public class KdvTutarHesabı2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double anaPara,kdvOrani=0.18,kdvliFiyat,kdvTutari;


        System.out.print("Fiyat:");
        anaPara= input.nextDouble();

        System.out.println("KDV oranı:"+kdvOrani);

        kdvTutari=anaPara*kdvOrani;
        System.out.println("KDV fiyatı:"+kdvTutari);


        kdvliFiyat=anaPara+kdvTutari;
        System.out.println("KDVli fiyat:"+kdvliFiyat);








    }
}
