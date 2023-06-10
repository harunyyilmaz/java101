import java.util.Scanner;

public class Kdv33 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double anapara ,kdvlifiyat,kdvoran=0.18,kdvtutar;


        System.out.println("anapara:");
        anapara= input.nextDouble();


        System.out.println(anapara);
        System.out.println(kdvoran);

        kdvtutar=anapara*kdvoran;
        System.out.println(kdvtutar);


        kdvlifiyat=anapara+kdvtutar;
        System.out.println(kdvlifiyat);






    }
}
