package main.java101.Arrayss;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArraysSinifiMetot {
    public static void main(String[] args) {

        int [] list = {1,2,3,4,};
        int [] list2= {9,5,8,6,3,4,1};
        double [] list3={1.1,2.2,3.3};
        int [] list4 = {1,2,3,4,5,6,7};
        int[] list5={-8,-9,-1,5,6,12,11};

        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(list2));
        System.out.println(Arrays.toString(list3));

        // hepsini 10 yapar.
        Arrays.fill(list4 , 10);
        System.out.println(Arrays.toString(list4));


        // küçükten büyüğe sıralama yapar.
        Arrays.sort(list5);
        System.out.println(Arrays.toString(list5));

        // Bulmak istediğin sayı için.( binarySearch)
        System.out.println(Arrays.binarySearch(list5,5));
        // 5 sayısının kaçıncı indiste olduğunu vermiş olur 3. indiste yer alıyormuş.

        int [] copylist = Arrays.copyOf(list5,3);
        System.out.println(Arrays.toString(copylist));

        int [] copylist1 = Arrays.copyOfRange(list5, 2,5);
        System.out.println(Arrays.toString(copylist1));

        System.out.println("-------------------------------------------------------------");

        int [] lst = {1,2,3};
        int [] lst1 = {1,2,3};
        int [] lst2 = {3,5,3};

        System.out.println(Arrays.equals(lst, lst1));
        System.out.println(Arrays.equals(lst,lst2));

        // HelperArray sınıfımızda metot tanımlayarak yaptık.
        System.out.println(HelperArray.equals(lst,lst1));
        System.out.println(HelperArray.equals(lst,lst2));


    }

}
