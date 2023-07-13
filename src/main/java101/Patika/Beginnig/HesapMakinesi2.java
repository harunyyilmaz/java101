package main.java101.Patika.Beginnig;

import java.util.Scanner;

public class HesapMakinesi2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double x1,x2,x3,Select;

        System.out.print("ilk sayıyı giriniz:");
        x1= input.nextDouble();
        System.out.print("ikinci sayıyı giriniz:");
        x2= input.nextDouble();
        System.out.print("üçüncü sayıyı giriniz:");
        x3= input.nextDouble();

        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.print("Seçiniz:");
        Select= input.nextDouble();



        if (Select==1) {
            System.out.println("toplama:"+ (x1+x2+x3));
        }else if(Select==2){
            System.out.println("çıkarma:"+(x1-x2-x2));
        }else if(Select==3){
            System.out.println("çarpma:"+(x1*x2*x3));
        }else if(Select==4){
            if(x2!=0){

            System.out.println("bölme:"+(x1/x2/x3));
        }else{
                System.out.println("\"Bir sayı sıfır ile bölünemez\"");
            }
            }else{
                System.out.println("Hatalı seçim yaptnız: Tekrar deneyiniz");
            }
    }
}
