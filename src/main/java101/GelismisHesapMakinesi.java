package main.java101;

import java.util.Scanner;

public class GelismisHesapMakinesi {

    static int sum(int a,int b){
        int result=a+b;
        System.out.println("Toplam:"+result);
        return result;
    }
    static int minus(int a,int b){
        int result=a-b;
        System.out.println("Çıkarma:"+result);
        return result;
    }
    static void times(int a,int b){
        int result=a*b;
        System.out.println("Çarpımı:"+result);
    }
    static int divided(int a,int b){
        if(b==0) {
            System.out.println("Hiçbir sayı 0' bölünemez.");
            return 0;
        }
        int result=a/b;
        System.out.println("Bölüm:"+result);
        return result;
    }
    static void power(int a,int b){
        int result=1;
        for(int i=1; i<=b; i++){
            result *=a;
        }
        System.out.println("üssü:"+result);
    }
    static int mod(int a,int b){
        int result= a % b;
        System.out.println("Modu:"+result);
        return result;
    }
    static void calc(int a, int b){
        System.out.println("Çevresi:"+ 2*(a+b));
        System.out.println("Alanı:"+ a*b);

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String menu="1-toplama:\n"+
                "2-çıkarma:\n"+
                "3-çarpma:\n"+
                "4-bölme:\n"+
                "5-üs alma:\n"+
                "6-mod alma:\n"+
                "7-dikdörtgen çevre ve alan hesabı:";

        int a,b,select;

        while (true){
            System.out.println(menu );
            System.out.print("Yapmak istediğiniz işlemi seçiniz:");
            select= input.nextInt();

            if(select==8);
            break;
        }
        System.out.print("ilk sayıyı giriniz:");
        a= input.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        b= input.nextInt();

        switch (select){
            case 1:
                sum(a,b);
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
                power(a,b);
                break;
            case 6:
                mod(a,b);
                break;
            case 7:
                calc(a,b);
                break;
            default:
                System.out.println("Geçersiz işlem yaptınız...");



        }


    }
}
