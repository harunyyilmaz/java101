package main.java101;

import java.util.Scanner;

public class AtmProjesiSwitchCase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String userName,password;
        int right=3;
        int select;
        int balance=1500;

        while (right>0) {

            System.out.print("Kullanıcı adınız:");
            userName = input.nextLine();
            System.out.print("Şifreniz:");
            password = input.nextLine();

            if (userName.equals("harunyyilmaz") && password.equals("harun1905")) {
                System.out.println("Merhaba Tayf Bankasına Hoş Geldiniz.");

                do{
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
                    System.out.println("1-Para yatırma:\n" +
                            "2-Para çekme\n" +
                            "3-Bakiye sorgulama\n" +
                            "4-Çıkış yap");
                    System.out.print("Seçiminiz:");
                    select= input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı:");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı:");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiye miktarınız:" + balance);
                            break;
                    }
                }while (select!=4);
                System.out.println("Tekrar görüşmek üzere...");

                break;
            } else {
                right--;
                System.out.println("Hatalı şifre veya kullanıcı adı girdiniz. Lütfen tekrar deneyiniz");
                if(right==0){
                    System.out.println("Banka hesabınız bloke olmuştur.Lütfen banka ile iletişime geçiniz");
                }else {
                    System.out.println("Kalan hakkınız:" + right);
                }
            }
        }
    }
}
