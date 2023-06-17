package main.java101;

public class SwitchCase {
    public static void main(String[] args) {

        int day=1;

        if (day==1) {
            System.out.println("bugün pazartesi");
        } else if (day==2) {
            System.out.println("bugün salı");
        }else if(day==3){
            System.out.println("bugün çarşamba");
        }else if(day==4){
            System.out.println("bugün perşembe");
        }else if(day==5){
            System.out.println("bugün cuma");
        }else if(day==6){
            System.out.println("bugün cumartesi");
        }else if (day==7) {
            System.out.println("bugün pazar");
        }else{
            System.out.println("HATALI");
        }

        int Day=1;

        switch(Day){
            case 1:
                System.out.println("pazartesi");
                System.out.println("haftanın başı");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                System.out.println("haftanın son günü");
                break;

            default:
                System.out.println("hatalı giriş yaptınız");

        }
    }
}
