package main.java101.Kodlamaio.JavaDersleri.PolymorphismDemo;

public class EmailBaseLogger extends BaseLogger{
    public void log(String message){
        System.out.println("Logged to email : " + message);
    }
}
