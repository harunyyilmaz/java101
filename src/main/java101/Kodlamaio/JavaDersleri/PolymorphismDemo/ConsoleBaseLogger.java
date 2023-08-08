package main.java101.Kodlamaio.JavaDersleri.PolymorphismDemo;

public class ConsoleBaseLogger extends BaseLogger {
    public void log(String message){
        System.out.println("Logged to console : " + message);
    }
}
