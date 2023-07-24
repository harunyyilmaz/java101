package main.java101.Arrays;

public class TekBoyutluDizler {
    public static void main(String[] args) {
        /*
        double[] list1;
        list1=new double[5];

         */

        String[] days={"pazartesi","salı","çarşamba"};
        String[] weekendDays= new String[]{"pazar","cumartesi"};
        System.out.println(days[0]);
        System.out.println(days[1]);
        System.out.println(days[2]);
        System.out.println("---------------------");
        System.out.println(weekendDays[0]);
        System.out.println(weekendDays[1]);

        System.out.println("=====================");
        System.out.println(days.length);
        System.out.println(weekendDays.length);
    }
}
