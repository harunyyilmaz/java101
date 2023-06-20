package main.java101;

import java.util.Scanner;

public class PratikTekSayiToplami {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int i, adet=0;
        int total=0;
        double ort;
        do {
            System.out.print("Sayıyı giriniz:");
            i= input.nextInt();
            if(i%4==0){
                total=total+i;
                adet++;

            }
        }while (i % 2==0);
        System.out.println("Toplam:"+total);
        System.out.println("sayı adeti:"+adet);
        ort=total/adet;
        System.out.println("ortalama:"+ort);

    }
}
