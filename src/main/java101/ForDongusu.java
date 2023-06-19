package main.java101;

import java.util.Scanner;

public class ForDongusu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int k;
        System.out.print("Sayıyı giriniz:");
        k= input.nextInt();

        for(int i=0; i<=k; ++i){
            if(i%3==0 && i%4==0)
            System.out.println(i);
        }

    }

}
