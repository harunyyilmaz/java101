package main.java101;

import java.util.Scanner;

public class PratikForDongusu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int k;
        int total=0 , adet=0;
        double ort;
        System.out.print("Sayıyı giriniz:");
        k= input.nextInt();

        for(int i=0; i<=k; ++i) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                total = total + i;
                adet++;
            }

        }
        System.out.println("Sayıların toplamı:"+total);
        System.out.println("Sayı adeti:"+adet);
        ort=total/adet;
        System.out.println("Sayıların ortalması:"+ort);

        }

}
