package main.java101.Kodlamaio.OopWithNLayeredApp.Core.Logging;

public class MailLogger implements Logger{

    @Override
    public void log(String data) {
        System.out.println("Mail gönderildi:" + data);
    }
}
