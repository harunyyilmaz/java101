package main.java101.Kodlamaio.JavaDersleri.PolymorphismDemo;

public class Main {
    public static void main(String[] args) {

       // BaseLogger[] loggers = new BaseLogger[]{new DataBaseLogger(),new EmailBaseLogger(),new FileBaseLogger(),new ConsoleBaseLogger()};
       // for(BaseLogger logger : loggers){
       //     logger.log("Log mesajı");
       // }

        CustomerManager customerManager = new CustomerManager(new DataBaseLogger());
        customerManager.add();
    }
}
