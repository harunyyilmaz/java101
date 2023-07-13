package main.java101.Patika.Beginnig;

import java.util.Scanner;

public class DaireDilimi {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int r,a;
        double dairealan, dilimalani, pi=3.14;

        System.out.print("Yarı çap:");
        r= input.nextInt();

        System.out.print("Daire açısı:");
        a= input.nextInt();


        System.out.print("Daire alan:");
        dairealan=pi*(r*r);
        System.out.println(dairealan);

        System.out.print("Dilim alan:");
        dilimalani= pi*(r*r)*a/360;
        System.out.println(dilimalani);










    }
}
