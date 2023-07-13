package main.java101.Patika.Beginnig;

import java.util.Scanner;

public class FaktoriyelHesaplama2 {
    public static void main(String[] args) {

        int n,i,r,a,kom;
        int nf=1;
        int rf=1;
        int af=1;


        Scanner input=new Scanner(System.in);
        System.out.print("n eleman sayısı:");
        n=input.nextInt();
        System.out.print("r elaman sayısı:");
        r=input.nextInt();

        for(i=n; i>0; i--){
            nf=nf*i;
        }
        System.out.println(nf);

        for(i=r; i>0; i--){
            rf=rf*i;
        }
        System.out.println(rf);

        a=n-r;
        for(i=a; i>0; i--){
            af=af*i;
        }
        System.out.println(af);

        kom=nf/(rf*af);

        System.out.print("(n,r) kombinasyonu: "+kom);



    }
}
