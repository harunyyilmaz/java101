package main.java101.Patika.Beginnig;

import java.util.Scanner;

public class ArmStrong1 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        int number= input.nextInt();
        int basNumber=0;
        int tempNumber=number;
        int basValue;
        int basPow;
        int result=0;


        if(tempNumber<=999) {


            while (tempNumber != 0) {

                tempNumber /= 10;
                basNumber++;
            }
            tempNumber = number;

            while (tempNumber != 0) {
                basValue = tempNumber % 10;

                basPow = 1;
                for (int k = 1; k <= basNumber; k++) {
                    basPow *= basValue;
                }
                result += basPow;
                tempNumber /= 10;
            }
            if(result==number) {
                System.out.println("Armstron sayıdır:" + result);
            }else{
                System.out.println("Armstrong sayısı değildir:" + result);
            }
        }else{
            System.out.println("yanlış giriş yaptınız.");
        }

    }
}
