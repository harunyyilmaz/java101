package main.java101;

import java.util.Scanner;

public class MinMaxBulma {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("sayı adeti:");
        int n= input.nextInt();

        int min=0;
        int max=0;
        int number;

        for(int i=1; i<=n; i++){
            System.out.print(i+" . sayı:");
            number= input.nextInt();

            if(number<min || min==0) {

                min = number;

            }
            if(number>max){

                max=number;

            }
        }
        System.out.println("max değerim :"+max);
        System.out.println("min  değerim :"+min);
    }
}
