package main.java101.Patika.Beginnig;

import java.util.Scanner;

public class Taksi {
    public static void main(String[] args) {



        int km;
        double perKm=2.20;
        double Toplam, starPrice=10;
        Scanner input=new Scanner(System.in);

        System.out.print("gidilen mesafe:");
        km= input.nextInt();

        System.out.print("ödenecek tutar:");
        Toplam= (km*perKm) +(starPrice);
        Toplam= (Toplam<20) ? 20 :Toplam;
        System.out.println(Toplam);









    }
}
