import java.util.Scanner;

public class DaireDilimi {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int r;
        double dairealan, dilimalani, pi=3.14, a=30;

        System.out.print("Yarı çap:");
        r= input.nextInt();

        System.out.print("Daire alan:");
        dairealan=pi*(r*r);
        System.out.println(dairealan);

        System.out.print("Dilim alan:");
        dilimalani= pi*(r*r)*a/360;
        System.out.println(dilimalani);










    }
}
