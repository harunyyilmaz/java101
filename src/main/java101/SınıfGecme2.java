import java.util.Scanner;

public class SınıfGecme2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int mat,fizik,turkce,tarih,muzik;

        System.out.print("matematik notunuz:");
        mat= input.nextInt();
        System.out.print("fizik notunuz:");
        fizik= input.nextInt();
        System.out.print("türkçe notunuz:");
        turkce= input.nextInt();
        System.out.print("tarih notunuz:");
        tarih= input.nextInt();
        System.out.print("müzik notunuz:");
        muzik= input.nextInt();

        double ortalama=(mat+fizik+turkce+tarih+muzik)/5;

        if(ortalama>=0 && ortalama<=100){
            if(ortalama>=55){
                System.out.println("Ortalamanız:"+ortalama);
                System.out.println("Geçtiniz");
            }else{
                System.out.println("Ortalamanız:"+ortalama);
                System.out.println("Kaldınız");
            }
        }else{
            System.out.println("Ortalamanız hesaplanamadı");
        }



    }
}
