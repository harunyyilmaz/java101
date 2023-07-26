package main.java101.Arrays;

import java.util.Arrays;

public class ArraysDiziTekrari {

    static boolean isFind(int[] arr, int value){
        for( int i: arr){
            if( i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[] list = {4, 7, 4, 4, 2, 9, 1, 21, 1, 4, 9, 2,2,2,6,7,6};
        int[] duplicate= new int[list.length];
        int startIndex=0;


        for(int i=0; i < list.length; i++){
            for(int j=0; j < list.length; j++){
                if( i != j && list[i] == list[j]){
                    if(list[i]%2==0){
                        if( !isFind (duplicate,list[i])){
                            duplicate[startIndex++]=list[i];
                        }
                    }
                    break;

                }

            }
        }
        for( int k : duplicate){
            if( k != 0){
                System.out.print(k + " , ");
            }
        }
    }
}
