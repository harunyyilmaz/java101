package main.java101.Arrays;


import java.util.Arrays;
import java.util.Scanner;

public class DiziFrekansi {

    static boolean isFind(int[] arr,int value){
        for( int i: arr){
            if( i== value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Sayı adedini giriniz:");
        int n= input.nextInt();

        int[] list=new int[n];
        int[] duplicate=new int[list.length];
        int starIndex=0;

        for( int i=0; i < list.length; i++){

            System.out.print("Sayıları giriniz:");
            list[i]= input.nextInt();

            for (int j=0; j < list.length; j++){

                if( i != j && list[i]==list[j]){
                    if( !isFind(duplicate,list[i])){
                        duplicate[starIndex++]=list[i];

                    }
                }
            }
        }
        for( int k : duplicate){
            if( k!=0){
                System.out.println(k+" sayısı tekrar eden sayıdır.");

            }
        }

    }
}
