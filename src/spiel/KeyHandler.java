package spiel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            Var.moveup = false;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            Var.movedown = false;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            Var.moveleft = false;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            Var.moveright = false;

        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            Var.moveup = true;
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            Var.movedown = true;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            Var.moveleft = true;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            Var.moveright = true;

        }


    }

}
