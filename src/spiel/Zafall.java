package spiel;


import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Zafall {
    int moin;
    int moin1;
    Timer move;

    public Zafall() {

        Random x = new Random();
        moin = x.nextInt(500);

        Random y = new Random();
        moin1 = y.nextInt(500);
    }

    public int getMoin() {
        return moin;
    }

    public int getMoin1() {
        return moin1;
    }
}