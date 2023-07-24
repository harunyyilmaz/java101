package main.java101.Arrays;

public class DizilerOrtalamaHesabi {

    public static void main(String[] args) {

        int[] list={5,10,50,60,40,20,30,70};
        double average=0.0;
        int sum=0;

        for(int i=0; i < list.length; i++){
            sum += list[i];
            average=sum/ list.length;
        }
        System.out.println(sum);
        System.out.println(average);

    }
}
