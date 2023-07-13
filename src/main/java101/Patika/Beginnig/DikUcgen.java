package main.java101.Patika.Beginnig;

import java.util.Scanner;

public class DikUcgen {
    public static void main(String[] args) {

        int a,b;
        double c;

        Scanner input=new Scanner(System.in);
        System.out.print("1. Kenarı giriniz:");
        a= input.nextInt();
        System.out.print("2.kenarı giriniz:");
        b= input.nextInt();


        System.out.print("Hipotenüs:");
        c= Math.sqrt((a*a)+(b*b));
        System.out.println(c);



    }
}
