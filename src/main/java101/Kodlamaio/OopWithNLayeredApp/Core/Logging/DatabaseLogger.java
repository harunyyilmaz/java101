package main.java101.Kodlamaio.OopWithNLayeredApp.Core.Logging;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Veri tabanına loglandı:" + data);
    }
}
