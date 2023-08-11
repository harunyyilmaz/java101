package main.java101.Kodlamaio.KodlamioWithNLayerdApp.Logging;

public class FileLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Dosyaya kaydedildi:" + data);
    }
}
