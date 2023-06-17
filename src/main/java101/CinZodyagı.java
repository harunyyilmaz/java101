import java.util.Scanner;

public class CinZodyagı {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int yil,kalan;
        String zodYagi="";

        System.out.print("Doğduğunuz yıl:");
        yil= input.nextInt();


        kalan=yil%12;
        System.out.println("Doğduğunuz yılın bölümünden kalan:"+kalan);


        switch (kalan){
            case 0:
                zodYagi="Maymun";
                break;
            case 1:
                zodYagi="Horoz";
                break;
            case 2:
                zodYagi="Köpek";
                break;
            case 3:
                zodYagi="Domuz";
                break;
            case 4:
                zodYagi="Fare";
                break;
            case 5:
                zodYagi="Öküz";
                break;
            case 6:
                zodYagi="Kaplan";
                break;
            case 7:
                zodYagi="Tavşan";
                break;
            case 8:
                zodYagi="Ejderha";
                break;
            case 9:
                zodYagi="Yılan";
                break;
            case 10:
                zodYagi="At";
                break;
            case 11:
                zodYagi="Koyun";
                break;
        }
        System.out.println("Çin zodyağınız:"+zodYagi);





    }
}
