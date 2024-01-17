package funtional;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Listeners implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent. VK_W) {
            Main.up = true;
        }
        if (key == KeyEvent. VK_S) {
            Main.down = true;
        }
        if (key == KeyEvent. VK_A) {
            Main.left = true;
        }
        if (key == KeyEvent. VK_D) {
            Main.right = true;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent. VK_W) {
            Main.up = false;
        }
        if (key == KeyEvent. VK_S) {
            Main.down = false;
        }
        if (key == KeyEvent. VK_A) {
            Main.left = false;
        }
        if (key == KeyEvent. VK_D) {
            Main.right = false;
        }

    }
}
