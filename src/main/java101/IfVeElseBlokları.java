package main.java101;

public class IfVeElseBlokları {
    public static void main(String[] args) {

        int a=5,b=8,c=3;

        boolean kosul1=(a<b)&&(a<c);
        boolean kosul2=(b<c)&&(b<a);
        boolean kosul3=(c<a)&&(c<b);

        if (kosul1) {
            System.out.println("a en küçüktür.");
        }else if(kosul2){
            System.out.println("b en küçüktür.");
        }else if(kosul3){
            System.out.println("c en küçüktür.");


            String str=kosul1 ? "doğru":"yanlış";
            System.out.println(str);
            String str1=kosul2 ? "doğru":"yanlış";
            System.out.println(str1);
            String str2=kosul3 ? "doğru":"yanlış";
            System.out.println(str2);
        }
    }
}