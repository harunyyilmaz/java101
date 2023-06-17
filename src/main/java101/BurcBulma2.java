import java.util.Scanner;

public class BurcBulma2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int month,day;
        String burc="";
        boolean isError=false;

        System.out.print("Doğduğunuz ay :");
        month=input.nextInt();
        System.out.print("doğduğunuz gün :");
        day= input.nextInt();

        switch (month){
            case 1:
                if(day>=1 && day<=31) {
                    if (day < 22) {
                        burc = "Oğlak burcu";
                    } else {
                        burc = "Kova burcu";
                    }
                }else{
                    isError=true;
                }
                break;
            case 2 :
                if(day>=1 && day<=28){
                    if(day<20){
                        burc="Kova burcu";

                    }else{
                        burc="Balık burcu";
                    }
                }else{
                    isError=true;
                }
                break;

            case 3 :
                if(day>=1 && day>=31){
                    if(day<21){
                        burc="Balık burcu";

                    }else{
                        burc="Koç burcu";
                    }
                }else{
                    isError=true;
                }
                break;
            case 4:
                if(day>=1 && day<=30){
                    if(day<21){
                        burc="Koç burcu";

                    }else{
                        burc="Boğa burcu";
                    }

                }else{
                    isError=true;
                }
                break;
            case 5 :
                if(day>=1 && day<=31){
                    if(day<22){
                        burc="Boğa burcu";

                    }else{
                        burc="İkizler burcu";
                    }
                }else{
                    isError=true;
                }
                break;
            case 6 :
                if(day>=1 && day<=30){
                    if(day<23){
                        burc="İkizler burcu";

                    }else{
                        burc="Yengeç burcu";

                    }
                }else{
                    isError=true;
                }
                break;
            case 7 :
                if(day>=1 && day<=31){
                    if(day<23){
                        burc="Yengeç burcu";

                    }else{
                        burc="Aslan burcu";
                    }
                }else{
                    isError=true;
                }
                break;
            case 8:
                if(day>=1 && day<=30){
                    if(day<23) {
                        burc="Aslan burcu";

                    }else{
                        burc="Başak burcu";
                    }
                }else{
                    isError=true;
                }
                break;
            case 9:
                if(day>=1 && day<=31){
                    if(day<23){
                        burc="Başak burcu";

                    }else{
                        burc="Terazi burcu";
                    }

                }else{
                    isError=true;
                }
                break;
            case 10:
                if(day>=1 && day<=30) {
                    if (day < 23) {
                        burc = "Terazi bucu";

                    } else {
                        burc = "Akrep burcu";
                    }

                }else{
                    isError=true;
                }
                break;
            case 11 :
                if(day>=1 && day<=31){
                    if(day<22){
                        burc="Akrep burcu";
                    }else{
                        burc="Yay burcu";
                    }
                }else{
                    isError=true;
                }
                break;
            case 12 :
                if (day>=1 && day<=30){
                    if(day<22){
                        burc="Yay burcu";

                    }else{
                        burc="Oğlak burcu";
                    }

                }else{
                    isError=true;
                }
            default:
                isError=true;

        }if(isError){
            System.out.println("Hatalı ay veya gün girdiniz"+ isError);

        }else{
            System.out.println("Burcunuz :"+burc);
        }








    }
}
