package main.java101.Patika.Beginnig;

public class Karsilastirma {
    public static void main(String[] args) {

        int a=10 , b=20 , c=5 ,d=8;

        System.out.println(a==c);
        System.out.println(a>b);
        System.out.println(b<c);
        System.out.println(d!=b);

        // mantıksal operaörler


        int A=10, B=20 ,C=5;

        boolean kosul1=A==B;
        boolean kosul2=A<=B;
        boolean sonuc=kosul1&&kosul2;
        boolean sonuc1=kosul1||kosul2;
        boolean sonuc2=(kosul1&&kosul2);
        System.out.println(kosul1);
        System.out.println(kosul2);
        System.out.println(sonuc);
        System.out.println(sonuc1);
        System.out.println(!sonuc2);

        // ? operatörü:


        int X=10,Y=20,Z;
        Z= (X==Y) ? 2:3;
        System.out.println(Z);

        int harun=17, hakki=15,cvp;
        cvp=(harun>hakki)? 1:0;

        boolean Sonuc=harun>hakki;
        System.out.println(!Sonuc);
        System.out.println(cvp);







    }
}
