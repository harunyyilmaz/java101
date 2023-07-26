package main.java101.Arrays;


public class PalindromikKelime {

    static boolean isPalindrome( String str){
        int i=0;
        int j=str.length()-1;
        while (i < j){
            if(str.charAt(i)==str.charAt(j)){
                return true;
            }
            i++;
            j--;
        }
        return false;

    }

    static boolean isPalindrome2(String str){

        String reverse="";
        for(int i = str.length()-1; i>=str.length()-1; i--){

            reverse += str.charAt(i);
        }

        return str.equals(reverse);
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("kayak"));
        System.out.println(isPalindrome("kayak"));


    }
}
