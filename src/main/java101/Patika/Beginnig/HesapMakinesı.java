package main.java101.Patika.Beginnig;

import java.util.Scanner;

public class HesapMakinesı {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int n1,n2,select;

        System.out.print("ilk sayıyı giriniz:");
        n1= input.nextInt();

        System.out.print("ikinci sayıyı giriniz:");
        n2= input.nextInt();

        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.print("SEÇİMİNİZ:");
        select= input.nextInt();

        if(select==1){
            System.out.println("toplam:"+(n1+n2));
        } else if (select==2){
            System.out.println("çıkarma:"+(n1-n1));
        } else if (select==3) {
            System.out.println("çarpma:"+(n1*n2));
        } else if (select==4) {
            if (n2 != 0) {
                System.out.println("bölme:" + (n1 / n2));
            } else {
                System.out.println("Bir sayı sıfıra bölünemez");
            }
        }else{
            System.out.println("Hatalı:tekrar deneyiniz");
        }



















    }
}
