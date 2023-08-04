package main.java101.Kodlamaio.JavaDersleri;

public class MukemmelSayi {
    public static void main(String[] args) {

        int[] sayilar={1,5,2,6,8,9,3};
        int aranacak=5;
        boolean varMi=false;

        for(int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi=true;
                break;
            }
        }
        if(varMi){
            System.out.println("Sayı bulunmaktadır.");
        }else{
            System.out.println("Sayı bulunmamaktadır.");
        }

    }
}
