import java.util.Scanner;

public class OdevManav {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double toplam, armut,elma,domates,muz,patlican;
        double Af=2.14,Ef=3.67,Df=1.11,Mf=0.95,Pf=5.00;



        System.out.print("artmut kg:");
        armut= input.nextDouble();
        System.out.print("elma kg:");
        elma= input.nextDouble();
        System.out.print("domates kg:");
        domates= input.nextDouble();
        System.out.print("muz kg:");
        muz= input.nextDouble();
        System.out.print("patlıcan kg:");
        patlican= input.nextDouble();


        toplam=(Af*armut)+(Ef*elma)+(Df*domates)+(Mf*muz)+(Pf*patlican);
        System.out.print("toplam tutar:"+toplam);









    }
}
