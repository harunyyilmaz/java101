package main.java101;

import java.util.Scanner;

public class SayininKuvveti {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n;

        System.out.print("Sınır sayısını giriniz:");
        n= input.nextInt();
        for(int i=1; i<=n; i*=4){
            System.out.println("4 ün kuvvetleri:"+i);
        }
        System.out.println("-------------");
        for(int k=1; k<=n; k*=5){
            System.out.println("5 in kuvvetleri:"+k);

        }

    }
}
