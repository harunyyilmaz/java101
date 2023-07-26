package main.java101.Arrays;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmini {
    public static void main(String[] args) {

        Random rand=new Random();
        int number= rand.nextInt(100);
        //int number= (int) (Math.random()*100);
        System.out.println(number);

        Scanner input=new Scanner(System.in);


        int right=0;
        int[] wrong= new int[5];
        boolean isWin=false;
        boolean isWrong=false;


        while (right < 5){
            System.out.print("Bir sayı tahmin ediniz:");
            int select= input.nextInt();

            if(select<0 || select>99){
                System.out.println("Lütfen 1-100 arasında bir değer giriniz!");
                if(isWrong){
                    right++;
                    System.out.println("Çok fazla hatalı sayı seçtiniz:" + (5-right));
                }else{
                    isWrong=true;
                    System.out.println("Bir sonraki hatalı girişte hakkınız düşülecektir.");
                }
                continue;
            }

            if( select == number){
                System.out.println("Tebrikler doğru tahmin. Tahmin ettiğiniz sayı:" + number);
                isWin=true;

                break;
            }else{
                System.out.println("Hatalı bir sayı girdiniz.");
                if(select>number){
                    System.out.println(select + " sayısı. Gizli sayıdan büyük bir sayı girdiniz.");
                }else{
                    System.out.println(select + " sayısı. Gizli sayıdan küçük bir sayı girdiniz.");
                }
                wrong[right]=select;
                right++;
                System.out.println("Kalan hakkınız:" + (5 - right));
            }
            if( !isWin ){
                System.out.println("Kaybettiniz !");
                if(!isWrong){
                    System.out.println("Tahmin ettiğiniz sayılar:" + Arrays.toString(wrong));

                }
            }




        }


    }
}
