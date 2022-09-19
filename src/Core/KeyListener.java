package Core;

import GFX.Variables;

import java.awt.event.KeyEvent;


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

                }
                if(e.getKeyCode()==KeyEvent.VK_2){
                    Variables.world = 2;
                }
                if(e.getKeyCode()==KeyEvent.VK_SPACE){
                    //Loop.tick();
                    Refresh.refresh();
                }
                if(e.getKeyCode()==KeyEvent.VK_D){
                    Player.Refresh.right = true;
                }
                if(e.getKeyCode()==KeyEvent.VK_A){
                    Player.Refresh.left = true;
                }
                if(e.getKeyCode()==KeyEvent.VK_S){
                    Player.Refresh.down = true;
                }
                if(e.getKeyCode()==KeyEvent.VK_W){
                    Player.Refresh.up = true;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_D){
                    Player.Refresh.right = false;
                }
                if(e.getKeyCode()==KeyEvent.VK_A){
                    Player.Refresh.left = false;
                }
                if(e.getKeyCode()==KeyEvent.VK_S){
                    Player.Refresh.down = false;
                }
                if(e.getKeyCode()==KeyEvent.VK_W){
                    Player.Refresh.up = false;
                }
            }
        });
    }

}
