import java.util.Scanner;

public class Havasicakligi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int heat;
        System.out.print("Sıcaklık derecesi:");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz:");
        } else if (heat >= 5 && heat <= 20) {
            System.out.println("sinema");
            if (heat < 10) {
                System.out.println("piknik");
            }
        }else{
            System.out.println("yüzme");
        }
    }
}


