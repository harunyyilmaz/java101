import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);


        String userName,password;
        int select;


        System.out.print("Kullanıcı adınızı giriniz:");
        userName= input.nextLine();
        System.out.print("Şifrenizi giriniz:");
        password= input.nextLine();

        if(userName.equals("harunyyilmaz")&&password.equals("harun.1905")){
            System.out.println("Giriş yapıldı.");

        }else if(!userName.equals("harunyyilmaz")){
            System.out.println("kullanıcı adınız yanlış");
            System.out.println("kullanıcı adınızı sıfırlamak ister misiniz?");

        }else if(!password.equals("harun.1905")){
            System.out.println("şifreniz yanlış");
            System.out.println("şifrenizi sıfırlamak ister misiniz? 1- evet 2- hayır:");
            select= input.nextInt();

        }
    }
}
