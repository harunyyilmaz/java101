package main.java101;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userName ,password;
        int right=3;
        int select;
        int balance=1500;

        while (right>0){

        System.out.print("Kulanıcı adınız:");
        userName= input.nextLine();
        System.out.print("Şifreniz:");
        password= input.nextLine();

        if(userName.equals("harunyyilmaz")&& password.equals("harun1905")){
            System.out.println("Giriş yapıldı. Tayf bankasına hoş geldiniz.");
         do{
             System.out.println("Lütfen yapamak istediğiniz işlemi onaylayın.");
             System.out.println("1-Para yatırma\n" +
                     "2-Para çekme\n" +
                     "3-Bakiye sorgulma\n" +
                     "4-Çıkış yap");
             System.out.print("Seçiminiz:");
             select= input.nextInt();

             if(select==1){
                 System.out.print("Para miktarı:");
                 int price= input.nextInt();
                 balance +=price;
             }else if(select==2){
                 System.out.print("Para miktarı:");
                 int price= input.nextInt();
                 if(price>balance){
                     System.out.println("Bakiye yetersiz.");

                 }else{
                     balance -=price;
                 }
             }else if(select==3){
                 System.out.println("Para miktarı:"+ balance);
             }

         }while (select!=4);
            System.out.println("Tekrar görüşmek üzere...");
            break;
        }else {
            right--;
            System.out.println("Hatalı giriş yaptınız.Lütfen tekrar deneyiniz.");
            if(right==0){
                System.out.println("Hesabınız bloke olmuştur.Lütfen banka ile iletişime geçiniz.");
            }else {
                System.out.println("Kalan hakkınız:" + right);
            }
        }
        }

    }

}
