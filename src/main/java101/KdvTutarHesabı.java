import java.util.Scanner;

public class KdvTutarHesabı {
    public static void main(String[] args) {

        double tutar, kdvOran=0.18,kdvTutar,kdvliTutar;

        Scanner input=new Scanner(System.in);
        System.out.print("ücret tutarı:");
        tutar= input.nextDouble();

        kdvTutar=tutar*kdvOran;
        kdvliTutar=tutar+kdvTutar;

        System.out.println(kdvTutar);
        System.out.println(kdvliTutar);
        System.out.println(tutar);
        System.out.println(kdvOran);





















    }
}
