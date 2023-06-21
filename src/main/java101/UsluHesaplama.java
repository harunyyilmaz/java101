package main.java101;

import java.util.Scanner;

public class UsluHesaplama {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("taban sayısı:");
        int n= input.nextInt();
        System.out.print("üs olacak sayı:");
        int k= input.nextInt();

        int total=1;

        for( int i=1; i<=k; i++){

            total=total*n;
        }
        System.out.println("cevap:"+total);





    }
}
