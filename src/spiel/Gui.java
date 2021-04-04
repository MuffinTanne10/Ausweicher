package spiel;

import javax.swing.*;

public class Gui {


    public Gui() {
        Var.jf1 = new JFrame();
        Var.jf1.setTitle("Weltraum Kake");
        Var.jf1.setSize(800,600 );
        Var.jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Var.jf1.setLayout(null);
        Var.jf1.setResizable(false);
        Var.jf1.setVisible(true);
        Var.jf1.setLocationRelativeTo(null);
        Var.jf1.addKeyListener(new KeyHandler());
        Var.jf1.requestFocus();

        Draw lbldraw = new Draw();
        lbldraw.setBounds(0,0, 800, 600);
        lbldraw.setVisible(true);
        Var.jf1.add(lbldraw);


    }
}
