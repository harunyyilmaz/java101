package main.java101.Patika.Beginnig;

import java.util.Scanner;

public class DikUcgen2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        double a,b,c;

        System.out.print("A kenarı:");
        a= input.nextDouble();
        System.out.print("B kenarı:");
        b= input.nextDouble();

        c=Math.sqrt ((a*a)+(b*b));
        System.out.println("Hipotüs:"+ c);





    }
}
