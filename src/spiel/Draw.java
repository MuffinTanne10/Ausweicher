package spiel;

import javax.swing.*;
import java.awt.*;
import java.util.Timer;

public class Draw extends JLabel {

    static int moin;
    static int moin1;
    static int x;
    static int y;
    Timer move;


    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g.setColor(Color.GREEN);
        g.fillRect(0, 0, 800, 600);

        g.setColor(Color.RED);
        g.fillRect(Var.x, Var.y, 35, 35);

        //move = new Timer();
        //move.scheduleAtFixedRate(new TimerTask() {

            //public void run() {

                x = new Zafall().getMoin();
                y = new Zafall().getMoin1();

                g.setColor(Color.RED);
                g.fillRect(x, y, 35, 35);

                repaint();

            }


        //}, 0, 1000);
        //repanit();
    }

