package main.java101.Patika.Beginnig;

public class OverLoading {

    static void print(){
        System.out.println("Parametresiz metot");
    }
    static void print(int a){
        System.out.println("Parametre:"+a);
    }
    static void print(double b){
        System.out.println("parametre:"+b);
    }
    static int print(int a, int b, int c){
        return a+b;
    }

    public static void main(String[] args) {
        print();
        print(12);
        print(15.0);
        System.out.println(print(5,2,6));

    }
}
