package Core;

import Loader.Loader;
import GFX.Variables;

import java.awt.event.KeyEvent;

import static Loader.Loader.tiles;

public class KeyListener {
    public static void keylistener(){

        Variables.window.addKeyListener(new java.awt.event.KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_1){
                    Variables.world = 1;
                    Loader.clear();
                    Loader.loader();
                }
                if(e.getKeyCode()==KeyEvent.VK_2){
                    Variables.world = 2;
                    Loader.clear();
                    Loader.loader();
                }
                if(e.getKeyCode()==KeyEvent.VK_SPACE){
                    Loop.tick();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
}
