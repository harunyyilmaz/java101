import java.util.Scanner;

public class DikUcgen2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int a,b;
        double c;

        System.out.print("a kenarı:");
        a= input.nextInt();

        System.out.print("b kenarı:");
        b= input.nextInt();

        System.out.print("hipotenüs");
        c=Math.sqrt((a*a)+(b*b));
        System.out.println(c);




    }
}
