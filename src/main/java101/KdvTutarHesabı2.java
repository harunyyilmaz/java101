import java.util.Scanner;

public class KdvTutarHesabı2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double tutar, kdvOran=0.18, kdvliFiyat,kdvTutar;


        System.out.println("anapara:");
        tutar= input.nextDouble();


        System.out.println(kdvOran);

        kdvTutar=tutar*kdvOran;
        System.out.println(kdvTutar);


        kdvliFiyat=tutar+kdvTutar;
        System.out.println(kdvliFiyat);


        System.out.println("anapara:"+tutar);








    }
}
