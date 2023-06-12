import java.util.Scanner;

public class KullaniciGirsi2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);



        String userName,password,code;

        System.out.print("Kullanıcı Adınız:");
        userName= input.nextLine();

        System.out.print("Şifreniz:");
        password= input.nextLine();




        if(userName.equals("harunyyilmaz") && (password.equals("harun1905"))){
            System.out.println("Giriş yapıldı");

        }else{
            System.out.println("Hatalı giriş.");

        }









        if (userName.equals("harunyyilmaz") && (password.equals("harun1905"))) {
        }





    }
}
