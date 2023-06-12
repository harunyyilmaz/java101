import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String userName,password;

        System.out.print("Kullanıcı Adınız:");
        userName= input.nextLine();

        System.out.print("Şifreniz:");
        password= input.nextLine();

        if(userName.equals("harunyyilmaz")&&(password.equals("harun1905"))){
            System.out.println("Helal olsun dayı oğlu...");
        }else{
            System.out.println("Hatalı giriş!");
        }
    }
}
