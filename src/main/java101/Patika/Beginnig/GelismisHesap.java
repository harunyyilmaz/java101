package main.java101.Patika.Beginnig;

import java.util.Scanner;

public class GelismisHesap {

    static int sum(int a ,int b){
        int result=a+b;
        System.out.println("toplam:"+result);
        return result;
    }
    static int minus(int a,int b){
        int result=a-b;
        System.out.println("Çıkarma:"+result);
        return result;
    }
    static int times(int a,int b){
        int result=a*b;
        System.out.println("Çarpım:"+result);
        return result;
    }
    static int divided(int a,int b){
        if(b==0){
            System.out.println("ikinici sayı 0'dan farklı olmalı");
            return 0;
        }
        int result=a/b;
        System.out.println("bölümü:"+result);
        return result;
    }
    static int power(int a,int b){
        int result=1;
        for(int i=1; i<=b; i++){
             result *= a;
        }
        return result;
    }
    static int mod(int a,int b){
        return a%b;
    }
    static void calc(int a,int b){
        System.out.println("çevresi:"+2*(a+b));
        System.out.println("alanı:"+a*b);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,select;

        String menu= "1- toplama işlemi:\n"
                +"2-çıkarma işlemi:\n"
                +"3-çarpma işelemi:\n"
                +"4-bölme işlemi:\n"
                +"5-üslü sayı hesaplama:\n"
                +"6-mod alma işlemi:\n"
                +"7-dikdörtgen alan ve çevre hesabı:\n"
                +"8-çıkış yap:";


        while (true) {
            System.out.println(menu);
            System.out.print("İşeleminizi seçiniz:");
            select = input.nextInt();

            if(select==8){
                break;
            }

            System.out.print("ilk sayıyı giriniz:");
            a = input.nextInt();
            System.out.print("ikinci sayısı giriniz:");
            b = input.nextInt();

            int result=0;

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    System.out.println("üs hesabı:"+power(a,b));
                    break;
                case 6:
                    System.out.println("modu:"+mod(a,b));
                    break;
                case 7:
                    calc(a,b);
                    break;
                default:
                    System.out.println("Geçersiz işlem seçtiniz...");

            }
        }
    }
}
