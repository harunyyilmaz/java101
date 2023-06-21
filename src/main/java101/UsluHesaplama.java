package main.java101;

import java.util.Scanner;

public class UsluHesaplama {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int n,k;

        System.out.print("n taban sayısını gir:");
        n= input.nextInt();
        System.out.print("k üssünü gir:");
        k= input.nextInt();

        int carpim=1;

        for(int i=1; i<=k; i++){

            carpim=carpim*n;
        }
        System.out.println(carpim);



    }
}
