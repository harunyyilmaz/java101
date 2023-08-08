package main.java101.Kodlamaio.JavaDersleri.AbstractClasses;

public abstract class GameCalculator {
    public abstract void hesapla();

    public final void gameOver(){
        System.out.println("Oyun bitti!");
    }
}
