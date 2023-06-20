package main.java101;

import java.util.Scanner;

public class ForWhileFarki {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

       /*int sayi;
       for(boolean run=true; run==true;){
           System.out.print("Sayı giriniz:");
           sayi= input.nextInt();
           if(sayi<0){
               run=false;

           }

       }

        */

        /*int sayi;
        System.out.print("Sayıyı giriniz:");
        sayi= input.nextInt();
        while (sayi>0){
            System.out.print("Sayı giriniz:");
            sayi= input.nextInt();

        }

         */

        int sayi;
        do {
            System.out.print("Sayı giriniz:");
            sayi= input.nextInt();
        }while (sayi>0);
    }

}
