import java.util.Scanner;

public class Kdv4 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double tutar,kdvOran=0.18,kdvTutar,kdvliTutar;
        System.out.print("GİRİŞ:");


        tutar= input.nextDouble();
        System.out.println(tutar);

        kdvTutar=tutar*kdvOran;
        System.out.println(kdvTutar);

        kdvliTutar=tutar+kdvTutar;
        System.out.println(kdvliTutar);

        System.out.println(kdvOran);






    }
}
