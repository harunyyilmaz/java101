package main.java101.Patika.Beginnig;

import java.util.Scanner;

public class UsluSayiHesabiMetot {

    static int power (int a, int b){

        if(b==0){
            int result=1;
            System.out.println("Bir sayının sıfırıncı kuvveti:"+result+"'dir");
            return result;

        }
        int result=1;
        for(int i=1; i<=b; ++i){
            result *=a;
        }
        System.out.println("Üssü:"+result);
        return result;
    }


    public static void main(String[] args) {

        int a,b;
        Scanner input=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz:");
        a=input.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        b= input.nextInt();
        power(a,b);





    }
}
