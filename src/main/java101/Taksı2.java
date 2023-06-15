import java.util.Scanner;

public class Taksı2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int km;
        double perKm=2.5,Total;
        double startprice=20;

        System.out.print("Başlangıç:");
        km= input.nextInt();
        System.out.println(km);

        System.out.print("Ödenecek Tutar:");


        Total=(km*perKm)+startprice;

        Total=Total<30 ? 30:Total;
        System.out.println(Total);



    }
}
