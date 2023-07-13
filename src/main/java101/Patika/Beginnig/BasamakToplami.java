package main.java101.Patika.Beginnig;

import java.util.Scanner;

public class BasamakToplami {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int number= input.nextInt();


        int tempNumber=number;
        int basNuumber=0;
        int basValue;
        int result=0;

        while (tempNumber!=0){

            tempNumber/=10;
            basNuumber++;
        }
        tempNumber=number;
        while (tempNumber!=0){

            basValue=tempNumber%10;
            System.out.println(basValue);
            result +=basValue;

            tempNumber/=10;
        }
        System.out.println("Basamak değerleri toplamı:"+result);
    }
}

