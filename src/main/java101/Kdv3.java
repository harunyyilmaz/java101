import java.util.Scanner;

public class Kdv3 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double anapara ,kdvlifiyat,kdvoran=0.18,kdvtutar;


        System.out.println("giriş");
        anapara= input.nextDouble();

        System.out.println("anapara");
        System.out.println(anapara);

        System.out.println("kdvoran:");
        System.out.println(kdvoran);

        System.out.println("kdvtutar;");
        kdvtutar=anapara*kdvoran;
        System.out.println(kdvtutar);

        System.out.println("kdvlifiyat");
        kdvlifiyat=anapara+kdvtutar;
        System.out.println(kdvlifiyat);






    }
}
