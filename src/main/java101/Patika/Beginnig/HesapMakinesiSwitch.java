package main.java101.Patika.Beginnig;

import java.util.Scanner;

public class HesapMakinesiSwitch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int x1,x2,select;
        System.out.print("birinci sayı giriniz:");
        x1= input.nextInt();
        System.out.print("ikinci sayı giriniz:");
        x2= input.nextInt();

        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.print("Seçiniz:");
        select= input.nextInt();

        switch (select){
            case 1:
                System.out.println( "cevap: "+ (x1+x2));
                break;
            case 2:
                System.out.println("cevap: "+ (x1-x2));
                break;
            case 3:
                System.out.println("cevap:"+ (x1*x2));
                break;
            case 4:
                if (x2!=0){
                    System.out.println("cevap:"+(x1/x2));
                }else{
                    System.out.println("Hiçbir sayı sıfıra bölünmez");
                }
                break;
            default:
                System.out.println("Hatalı seçim yaptınız...");

        }

    }
}
