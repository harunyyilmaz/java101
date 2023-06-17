package main.java101;

import java.util.Scanner;


public class SinifGecme {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);

        int mat,fizik,turkce,kimya,muzik;

        System.out.print("Tütkçe notu:");
        mat= input.nextInt();
        System.out.print("Fizik notu:");
        fizik= input.nextInt();
        System.out.print("Türkçe notu:");
        turkce= input.nextInt();
        System.out.print("Kimya notu:");
        kimya= input.nextInt();
        System.out.print("Müzik notu:");
        muzik= input.nextInt();

        double ortalama=(mat+fizik+turkce+kimya+muzik)/5;
        System.out.println("Ortalamanız:"+ortalama);


        if(ortalama<=50){
            System.out.println("sınıfta kaldınız:");
        }else{
            System.out.println("sınıfı geçtiniz");
        }








    }
}
