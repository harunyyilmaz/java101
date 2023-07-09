package main.java101;

public class ReturnVoid {

    static int sum(int a, int b){
        System.out.println(a+b);
        return a+b;
    }
    public static void main(String[] args) {
        int result= sum(5,2)+ sum(8,9);
        System.out.println(result);
        System.out.println(sum(8,2));

    }
}
