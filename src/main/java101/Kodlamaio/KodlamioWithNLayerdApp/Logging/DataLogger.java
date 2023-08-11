package main.java101.Kodlamaio.KodlamioWithNLayerdApp.Logging;

public class DataLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Data olarak kaydedildi:" + data);
    }
}
