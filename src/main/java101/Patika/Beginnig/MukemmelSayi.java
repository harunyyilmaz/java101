package main.java101.Patika.Beginnig;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("n sayısını giriniz:");
        int n= input.nextInt();

        int total=0;
        for (int i=1; i<n; i++){
            if(n%i==0){
                System.out.println(i);
                total +=i;
            }
        }
        System.out.println("toplam:"+total);

        if(total==n){
            System.out.println("n sayısı mükemmel sayıdır. ");
        }else{
            System.out.println("n sayısı mükemmel bir sayı değildir.");
        }
    }
}
