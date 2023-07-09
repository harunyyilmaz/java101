package main.java101;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.print("sayıyı girniz:");
        int n = input.nextInt();

        int a=0;
        int b=1;
        int c ;
        for( int i=0; i<n; i++){

            c=a+b;
            a=b;
            b=c;
            System.out.println(c);


        }


    }

}
