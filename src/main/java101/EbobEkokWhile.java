package main.java101;

import java.util.Scanner;

public class EbobEkokWhile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("n2 sayısını giriniz:");
        int n2= input.nextInt();

        System.out.print("n1 sayısını giriniz:");
        int n1= input.nextInt();

        if(n1<n2){

            int i=1;
            int ebob=1;
            while (i<=n1){
                if(n1%i==0 && n2%i==0){
                    ebob=i;
                }
                i++;
            }
            System.out.println("Ebob :"+ebob);
            System.out.println("Ekok :"+ (n1*n2)/ebob);
        }else{

            int i=1;
            int ebob=1;
           while(i<=n2) {
               if(n2%i==0 && n1%i==0){
                   ebob=i;
               }
               i++;
           }
            System.out.println("ebob :"+ebob);
            System.out.println("ekok :"+ (n1*n2)/ebob);



        }
    }
}
