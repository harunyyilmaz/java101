package main.java101.Arrays;
import java.util.Arrays;

public class ArraysÇiftSayi {
    public static void main(String[] args) {

        int[] list = {20,40,12,32,71,5,3,9,11,13,15,18,22,98,100,101};

        for(int i=0; i < list.length; i++){

            if( list[i] % 2 ==0 ){
                System.out.print(list[i]+" , ");
            }

        }
    }
}
