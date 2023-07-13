package main.java101.Patika.Beginnig;

public class Recursive {
    static int f(int n){

        if(n==1){
            return 1;
        }
        int result= f(n-1)+n;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(f(4));

    }
}
