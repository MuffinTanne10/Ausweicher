package spiel;

import java.util.Timer;
import java.util.TimerTask;

public class Movement {
    Timer move;

    public Movement() {
        move = new Timer();
        move.scheduleAtFixedRate(new TimerTask() {

            @Override
            public void run() {

                if (Var.moveup == true) {

                    if (Var.y >= 250) {
                        Var.y -= 2;
                    }
                } else if (Var.movedown == true) {

                    if (Var.y <= 520) {
                        Var.y += 2;
                    }
                } else if (Var.moveleft == true) {
                    if (Var.x >= 5)
                        Var.x -= 2;
                } else if (Var.moveright == true) {
                    if (Var.x <= 750) {
                        Var.x += 2;
                    }
                }

            }

        }, 0, 6);
    }
}