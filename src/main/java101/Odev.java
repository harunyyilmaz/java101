import java.util.Scanner;


public class Odev {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double kg,m;
        double kiloIndeks;


        System.out.print("Kilonuzu Giriniz:");
        kg= input.nextDouble();


        System.out.print("Boyunuzu Giriniz:");
        m= input.nextDouble();

        System.out.print("kitle indeksiniz:");
        kiloIndeks= kg* (m*m);
        System.out.println(kiloIndeks);








    }
}
