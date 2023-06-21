package main.java101;

import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("n elemanlı sayı:");
        int n= input.nextInt();

        System.out.print("r elemanlı sayı:");
        int r= input.nextInt();

        int nf=1;
        int rf=1;
        int a;
        int af=1;
        int kom;


        for(int i=1; i<=n; i++){

            nf=nf*i;
        }

        for(int i=1; i<=r; i++){

            rf=rf*i;
        }

        a=n-r;

        for(int i=1; i<=a; i++){

            af=af*i;
        }

        kom=nf/(rf*af);
        System.out.println("(n,r) kombinasyonu:"+kom);








    }
}
