package main.java101;

import java.util.Scanner;

public class AsalsayiMetot {

    static void asal(int n){
        boolean isAsal=true;

        for(int i=2; i<n; i++){
            if(n % i==0){
                isAsal=false;
                break;
            }
        }
        if(isAsal){
        System.out.println("n sayısı asaldır:"+n);
    }else{
            System.out.println("n sayısı asal değildir:"+n);
        }
    }


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int n= input.nextInt();
        asal(n);


    }
}