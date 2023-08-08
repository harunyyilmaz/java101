package main.java101.Kodlamaio.JavaDersleri.PolymorphismDemo;

public class FileBaseLogger extends BaseLogger{
    public void log(String message){
        System.out.println("Logged to file : " + message);
    }
}
