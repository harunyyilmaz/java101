package main.java101;

import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.print("N sayısını giriniz:");
        int n = input.nextInt();

        double result=0;
        for(int i=1; i<=n; i++){

            result +=(1.0/i);

        }
        System.out.println("Harmonik hesaplama:"+result);
    }
}

/*
      while Döngsünde harmonik hesap:

double result=0;
        double i=1;
        while (i<=n){

            result+=1/i;
            i++;
        }
        System.out.println("Harmonik hesabı:"+result);
 */

