import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int r;
        double cevre;
        double alan;
        double pi=3.14;
        System.out.print("Yarı Çap:");
        r= input.nextInt();

        System.out.print("dairenin alanı:");
        alan=pi*(r*r);
        System.out.println(alan);

        System.out.print("dairenin çevresi:");
        cevre=2*pi*r;
        System.out.println(cevre);


    }
}
