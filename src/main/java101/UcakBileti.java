package main.java101;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int km,yas,tip;
        double perKm=0.10 , normaltutar, indirim, biletF,tipIndirimi,tipBilet;

        System.out.print("Gidilen mesafe:");
        km= input.nextInt();
        System.out.print("Yaşınız:");
        yas= input.nextInt();
        System.out.println("1-tek yön\n2-çift yön");
        System.out.print("uçuş tipini seçiniz:");
        tip= input.nextInt();
        System.out.println("Km başı fiyat:" +perKm);

        normaltutar=perKm*km;

        switch (tip) {
            case 1:
                if (yas < 12) {
                    indirim = normaltutar * 0.50;
                    biletF = normaltutar - indirim;
                    System.out.println("Bilet Fiyatı:" + biletF);

                } else if (yas <= 24) {
                    indirim = normaltutar * 0.10;
                    biletF = normaltutar - indirim;
                    System.out.println("Bilet Fiyatı:" + biletF);

                } else if (yas <= 65) {
                    biletF = normaltutar;
                    System.out.println("Bilet Fiyatı:" + biletF);
                } else {
                    indirim = normaltutar * 0.30;
                    biletF = normaltutar - indirim;
                    System.out.println("Bilet Fiyatı:" + biletF);
                }
                break;
            case 2:
                if (yas < 12) {
                    indirim = normaltutar * 0.50;
                    biletF = (normaltutar - indirim);
                    tipIndirimi = biletF * 0.20;
                    tipBilet = biletF - tipIndirimi;
                    System.out.println("Bilet Fiyatı:" + tipBilet);

                } else if (yas <= 24) {
                    indirim = normaltutar * 0.10;
                    biletF = normaltutar - indirim;
                    tipIndirimi = biletF * 0.20;
                    tipBilet = biletF - tipIndirimi;
                    System.out.println("Bilet Fiyatı:" + tipBilet);

                } else if (yas <= 65) {
                    biletF = normaltutar;
                    tipIndirimi = biletF * 0.20;
                    tipBilet = biletF - tipIndirimi;
                    System.out.println("Bilet Fiyatı:" + tipBilet);

                } else {
                    indirim = normaltutar * 0.30;
                    biletF = normaltutar - indirim;
                    tipIndirimi = biletF * 0.20;
                    tipBilet = biletF - tipIndirimi;
                    System.out.println("Bilet Fiyatı:" + tipBilet);
                }
                break;
            default:
                System.out.println("Hatalı giriş yaptınız");


        }





    }
}
