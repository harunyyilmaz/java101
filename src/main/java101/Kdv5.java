import java.util.Scanner;

public class Kdv5 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double tutar,kdvOranı=0.18,kdvliFiyat,kdvFiyat;

        System.out.println("giriş:");
        tutar= input.nextDouble();


        System.out.print("tutar:");
        System.out.println(tutar);

        System.out.print("kdvfiyat:");
        kdvFiyat=tutar*kdvOranı;
        System.out.println(kdvFiyat);

        System.out.print("kdvlifiyat:");
        kdvliFiyat=tutar+kdvFiyat;
        System.out.println(kdvliFiyat);

        System.out.print("kdvOranı:");
        System.out.println(kdvOranı);

    }
}
