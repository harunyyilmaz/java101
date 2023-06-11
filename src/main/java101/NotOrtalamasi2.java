import java.util.Scanner;

public class NotOrtalamasi2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int mat,turkce,tarih,biyoloji;


        System.out.println("matematik notu:");
        mat= input.nextInt();


        System.out.println("türkçe notu:");
        turkce= input.nextInt();


        System.out.println("tarih notu:");
        tarih= input.nextInt();


        System.out.println("biyoloji notu:");
        biyoloji= input.nextInt();


        int toplam=mat+turkce+biyoloji+tarih;

        double ortalama=toplam/4;
        System.out.println("ortalama:");
        System.out.println(ortalama);

        double kosul1=80;

        boolean gecerli= ortalama>kosul1;
        System.out.println("gecerli:"+gecerli);






    }
}
