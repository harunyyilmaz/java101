package main.java101.Arrayss;
public class HelperArray {

    static void print  (int[] arr){

        for( int i=0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }

    static boolean equals (int [] l1,int [] l2){
        if(l1.length != l2.length ){
            return false;
        }
        for( int i=0; i < l2.length; i++ ){
            if(l1[i] != l2[i]){
                return false;
            }
        }
        return true;
    }



}
