package main.java101;

import java.util.Scanner;

public class HavaSicakligi2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int heat;

        System.out.print("Sıcaklık derecesi:");
        heat= input.nextInt();

        if(heat<5){
            System.out.println("Kayak yapabilirsiniz");
        }else if(heat>=5 && heat<=25){
            if(heat<=15){
                System.out.println("Sinemaya gidebilirsiniz");
            }
            if(heat>=10){
                System.out.println("Pikniğe gidebilirsiniz");
            }
        }else{
            System.out.println("Yüzmeye gidebilirsiniz");
        }




    }
}
