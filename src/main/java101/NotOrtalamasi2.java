import java.util.Scanner;

public class NotOrtalamasi2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int mat,turkce,fizik,tarih,muzik;

        System.out.print("Matematik notunuz:");
        mat= input.nextInt();
        System.out.print("Türkçe notunuz:");
        turkce= input.nextInt();
        System.out.print("Fizik notunuz:");
        fizik= input.nextInt();
        System.out.print("Tarih notunuz:");
        tarih= input.nextInt();
        System.out.print("Müzik notunuz:");
        muzik= input.nextInt();


        double ortalama=(mat+turkce+fizik+tarih+muzik)/5;
        System.out.println("Ortalama notunuz:"+ortalama);

        boolean gecerli= ortalama>60;
        String sonuc= gecerli ? "Sınıfı geçtiniz" :"Sınıfta kaldınız";
        System.out.println(sonuc);














    }
}
