package com.company;

public abstract class GameCalculator {

    //abstract verdiğimiz işlemi her extend eden class kullanmak zorunda.
    public abstract void hesapla();

    //final verdiğimiz işlem değiştirilemez.
    public final void gameOver(){
        System.out.println("Game over");
    }


}
