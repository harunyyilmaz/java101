package main.java101.Kodlamaio.KodlamioWithNLayerdApp.Logging;

public class MailLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println("Mail olarak kaydedildi:" + data);
    }
}
