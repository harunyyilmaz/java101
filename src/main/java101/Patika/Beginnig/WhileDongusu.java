package main.java101.Patika.Beginnig;

import java.util.Scanner;

public class WhileDongusu {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int password;
        boolean isPassword = false;


        while (!isPassword){
            System.out.print("Şifrenizi giriniz:");
            password= input.nextInt();
            if(password==123){
                System.out.println("Doğru");
                isPassword=true;
            }else{
                System.out.println("Yanlış");
            }
        }















    }
}
