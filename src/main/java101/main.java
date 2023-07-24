package main.java101;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        int[] list={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(list));

        Arrays.fill(list,2,5,20);
        System.out.println(Arrays.toString(list));

        Arrays.fill(list,10);
        System.out.println(Arrays.toString(list));

        int[] list2={-5,-9,-1,0,4,19,7};
        Arrays.sort(list2);
        System.out.println(Arrays.toString(list2));

        int[] list3={-5,-9,-18,20,21,40,14,70,51,-41};
        Arrays.sort(list3);
        System.out.println(Arrays.toString(list3));
        System.out.println(Arrays.binarySearch(list3,-18));

        int[] list4={1,2,3,4,5,6,7,8,9};
        int[] copyList=Arrays.copyOf(list4,list.length);
        System.out.println(Arrays.toString(copyList));

        int[] copyList2=Arrays.copyOf(list4,4);
        System.out.println(Arrays.toString(copyList2));


        int[] list5={10,20,30,40,50,60,70,80,90};
        int[] copy=Arrays.copyOfRange(list5,2,5);
        System.out.println(Arrays.toString(copy));


        int[] dizi={1,2,3};
        int[] dizi2={1,2,3};
        int[] dizi3={9,8,7};
        System.out.println(Arrays.equals(dizi,dizi2));
        System.out.println(Arrays.equals(dizi,dizi3));





    }
}
